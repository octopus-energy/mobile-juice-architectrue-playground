package com.octopus.ejplayground.domain

import kotlinx.coroutines.CoroutineDispatcher
import kotlinx.coroutines.Dispatchers

actual val Dispatchers.Background: CoroutineDispatcher
    get() = Dispatchers.Unconfined