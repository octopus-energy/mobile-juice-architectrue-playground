package com.octopus.ejplayground.viewmodels

import com.octopus.ejplayground.CallSuper
import com.octopus.ejplayground.domain.DispatcherProvider
import kotlinx.coroutines.*
import kotlinx.coroutines.channels.ConflatedBroadcastChannel
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.asFlow
import kotlinx.coroutines.flow.flowOn

abstract class MotherViewModel<T : MotherViewModel.ViewState, S : MotherViewModel.UiAction>(
    private val dispatcherProvider: DispatcherProvider
) : LifecycleReceiver {

    interface ViewState
    interface UiAction

    abstract var lastViewState: T
    private val viewStatePublisher = ConflatedBroadcastChannel<T>()
    private var coreroutineSupervisor = SupervisorJob()
    protected var coroutineScope: CoroutineScope = CoroutineScope(dispatcherProvider.main + coreroutineSupervisor)

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

    fun viewStateStream(): Flow<T> {
        return viewStatePublisher.asFlow()
            .flowOn(Dispatchers.Main)

    }

    protected fun emit(viewState: T) {
        viewStatePublisher.offer(viewState)
        lastViewState = viewState
    }
}