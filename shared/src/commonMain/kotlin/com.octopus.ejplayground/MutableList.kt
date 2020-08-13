package com.octopus.ejplayground

fun <T> MutableList<T>.removeFirstIfItExists(): MutableList<T> {
    try {
        this.removeAt(0)
    } catch (exception: Exception) {
        // Do nothing
    }
    return this
}