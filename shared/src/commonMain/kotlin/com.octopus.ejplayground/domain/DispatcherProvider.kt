package com.octopus.ejplayground.domain

import com.octopus.ejplayground.MakeInjectable
import kotlinx.coroutines.CoroutineDispatcher
import kotlinx.coroutines.Dispatchers

class DispatcherProvider @MakeInjectable constructor()  {

    val main: CoroutineDispatcher = Dispatchers.Main

    val background: CoroutineDispatcher = Dispatchers.IO

}

expect val Dispatchers.IO: CoroutineDispatcher