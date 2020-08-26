package com.octopus.ejplayground.common.threading

actual val currentThreadName: String?
    get() = Thread.currentThread().name