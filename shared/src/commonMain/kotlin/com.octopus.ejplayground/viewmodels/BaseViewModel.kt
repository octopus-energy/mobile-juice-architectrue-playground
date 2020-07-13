package com.octopus.ejplayground.viewmodels

import com.octopus.ejplayground.CallSuper
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.SupervisorJob
import kotlinx.coroutines.cancel
import kotlinx.coroutines.channels.ConflatedBroadcastChannel
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.asFlow

abstract class BaseViewModel<T : BaseViewState> : LifecycleReceiver {

    abstract var lastViewState: T
    private val viewStatePublisher = ConflatedBroadcastChannel<T>()
    private var coreroutineSupervisor = SupervisorJob()
    protected var coroutineScope: CoroutineScope = CoroutineScope(Dispatchers.Main + coreroutineSupervisor)

    @CallSuper
    override fun onAttach() {
        if (coreroutineSupervisor.isCancelled) {
            coreroutineSupervisor = SupervisorJob()
            coroutineScope = CoroutineScope(Dispatchers.Main + coreroutineSupervisor)
        }
    }

    @CallSuper
    override fun onDetach() {
        coroutineScope.cancel()
    }

    fun viewStateStream(): Flow<T> {
        return viewStatePublisher.asFlow()
    }

    protected fun emit(viewState: T) {
        viewStatePublisher.offer(viewState)
        lastViewState = viewState
    }
}