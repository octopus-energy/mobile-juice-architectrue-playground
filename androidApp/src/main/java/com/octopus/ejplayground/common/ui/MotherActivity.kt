package com.octopus.ejplayground.common.ui

import com.octopus.ejplayground.common.viewmodels.LifecycleReceiver
import dagger.android.support.DaggerAppCompatActivity
import dagger.android.support.DaggerFragment
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.SupervisorJob
import kotlinx.coroutines.cancel

abstract class MotherAppCompatActivity : DaggerAppCompatActivity() {

    private var coreroutineSupervisor = SupervisorJob()
    protected var coroutineScope: CoroutineScope = CoroutineScope(Dispatchers.Main + coreroutineSupervisor)

    abstract fun getLifecycleReceivers(): List<LifecycleReceiver>

    override fun onStart() {
        super.onStart()
        if (coreroutineSupervisor.isCancelled) {
            coreroutineSupervisor = SupervisorJob()
            coroutineScope = CoroutineScope(Dispatchers.Main + coreroutineSupervisor)
        }
        getLifecycleReceivers().forEach { it.onAttach() }
    }

    override fun onStop() {
        super.onStop()
        coroutineScope.cancel()
        getLifecycleReceivers().forEach { it.onDetach() }
    }
}