package com.octopus.ejplayground.viewmodels

import com.octopus.ejplayground.CallSuper
import com.octopus.ejplayground.domain.DispatcherProvider
import com.octopus.ejplayground.removeFirstIfItExists
import kotlinx.coroutines.*
import kotlinx.coroutines.channels.ConflatedBroadcastChannel
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.asFlow
import kotlinx.coroutines.flow.flowOn

abstract class MotherViewModel<T : MotherViewModel.ViewState, S : MotherViewModel.UiAction>(
    private val dispatcherProvider: DispatcherProvider
) : LifecycleReceiver {

    companion object {
        private const val MAX_VIEW_STATE_BACKSTACK = 5
    }

    interface ViewState
    interface UiAction

    abstract var lastViewState: T
    private val viewStateStack: MutableList<T> = mutableListOf()
    var viewStateUpdatedCallback: ((T) -> Unit)? = null
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

    protected fun emit(viewState: T) {
        lastViewState = viewState
        addToStack(viewState)
        viewStateUpdatedCallback?.invoke(viewState)
    }

    private fun addToStack(viewState: T) {
        if (viewStateStack.count() >= MAX_VIEW_STATE_BACKSTACK) {
            viewStateStack.removeFirstIfItExists()
        }
        viewStateStack.add(viewState)
    }

    fun setNewViewStateCallback(callback: ((T) -> Unit)?) {
        viewStateUpdatedCallback = callback
        viewStateStack.lastOrNull()?.let {
            viewStateUpdatedCallback?.invoke(it)
        }
    }
}