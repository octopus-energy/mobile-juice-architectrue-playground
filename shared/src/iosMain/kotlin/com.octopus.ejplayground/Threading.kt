package com.octopus.ejplayground

import platform.Foundation.NSThread

actual val currentThreadName: String?
    get() = NSThread.currentThread().debugDescription