package com.octopus.ejplayground.common.threading

import kotlin.native.concurrent.ensureNeverFrozen
import kotlin.native.concurrent.freeze
import kotlin.native.concurrent.isFrozen

actual fun <T> T.freezey(): T = this.freeze()

actual val <T> T.isFrozeny: Boolean
    get() = this.isFrozen

actual fun Any.ensureNeverFrozeny() = this.ensureNeverFrozen()