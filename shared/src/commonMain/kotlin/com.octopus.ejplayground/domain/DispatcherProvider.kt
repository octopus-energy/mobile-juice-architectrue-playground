package com.octopus.ejplayground.domain

import com.octopus.ejplayground.MakeInjectable
import kotlinx.coroutines.CoroutineDispatcher
import kotlinx.coroutines.Dispatchers

class DispatcherProvider @MakeInjectable constructor()  {

    val main: CoroutineDispatcher = Dispatchers.Unconfined

    val background: CoroutineDispatcher = Dispatchers.Background

}

expect val Dispatchers.Background: CoroutineDispatcher