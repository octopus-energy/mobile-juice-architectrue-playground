package com.octopus.ejplayground.common.threading

import kotlinx.coroutines.CoroutineDispatcher
import kotlinx.coroutines.Dispatchers

actual val Dispatchers.Background: CoroutineDispatcher
    get() = Dispatchers.IO