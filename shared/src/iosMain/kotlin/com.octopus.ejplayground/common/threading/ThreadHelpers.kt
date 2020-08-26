package com.octopus.ejplayground.common.threading

import platform.Foundation.NSThread

actual val currentThreadName: String?
    get() = NSThread.currentThread().debugDescription