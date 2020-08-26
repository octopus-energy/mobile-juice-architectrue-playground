package com.octopus.ejplayground.common.extensions

fun <T> MutableList<T>.removeFirstIfItExists(): MutableList<T> {
    try {
        this.removeAt(0)
    } catch (exception: Exception) {
        // Do nothing
    }
    return this
}