package com.octopus.ejplayground

actual fun <T> T.freezey(): T = this

actual val <T> T.isFrozeny: Boolean
    get() = false

actual fun Any.ensureNeverFrozeny() {}