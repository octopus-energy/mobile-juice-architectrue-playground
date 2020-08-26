package com.octopus.ejplayground.common.platform

import android.util.Log
import com.octopus.ejplayground.common.platform.Logger
import javax.inject.Inject

class LoggerImpl @Inject constructor() : Logger {

    override fun log(message: String) {
        Log.v("Playground", message)
    }
}