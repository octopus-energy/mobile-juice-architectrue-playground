package com.octopus.ejplayground.common.viewmodels

import com.octopus.ejplayground.common.CallSuper
import com.octopus.ejplayground.common.threading.CFlow
import com.octopus.ejplayground.common.threading.DispatcherProvider
import com.octopus.ejplayground.common.threading.wrap
import kotlinx.coroutines.*
import kotlinx.coroutines.channels.ConflatedBroadcastChannel
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.asFlow
import kotlinx.coroutines.flow.filter
import kotlinx.coroutines.flow.flowOn

abstract class MotherViewModel<T : MotherViewModel.ViewState, S : MotherViewModel.UiAction>(
    private val dispatcherProvider: DispatcherProvider
) : LifecycleReceiver {

    interface ViewState
    interface UiAction

    private var viewStatePublisher: ConflatedBroadcastChannel<T> = ConflatedBroadcastChannel()
    protected val lastViewState: T
        get() = viewStatePublisher.valueOrNull ?: defaultViewState()
    private var coreroutineSupervisor = SupervisorJob()
    protected var coroutineScope: CoroutineScope = CoroutineScope(dispatcherProvider.main + coreroutineSupervisor)

    abstract fun defaultViewState(): T

    @CallSuper
    override fun onAttach() {
        if (coreroutineSupervisor.isCancelled) {
            coreroutineSupervisor = SupervisorJob()
            coroutineScope = CoroutineScope(dispatcherProvider.main + coreroutineSupervisor)
        }
    }

    @CallSuper
    override fun onDetach() {
        coroutineScope.cancel()
    }

    abstract fun onAction(action: S)

    protected fun emit(viewState: T) {
        viewStatePublisher.offer(viewState)
    }

    /**
     * Can't get standard flow collecting values in native code.
     * Can collect the first value but nothing subsequent.
     * Also don't know how to close a flow from native.
     *
     * Using a separate function as no doubt this functionality will be added to the coroutine library in the near future
     * this makes it easier to change
     *
     * CFlow uses a few wrappers to handle this process in common code.
     */
    fun nativeViewStateStream(): CFlow<T> {
        return viewStateStream().wrap()
    }

    fun viewStateStream(): Flow<T> {
        return viewStatePublisher.asFlow()
            .filter { it != null } // Was getting null values down stream. No idea why as should never be able to happer
            .flowOn(dispatcherProvider.main)
    }
}