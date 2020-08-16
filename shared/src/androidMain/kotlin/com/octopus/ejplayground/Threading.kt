package com.octopus.ejplayground

actual val currentThreadName: String?
    get() = Thread.currentThread().name