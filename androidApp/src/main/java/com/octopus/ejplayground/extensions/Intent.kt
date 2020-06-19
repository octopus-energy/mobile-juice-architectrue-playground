package com.octopus.ejplayground.extensions

import android.app.Activity
import android.content.Intent

fun Intent.startActivity(originActivity: Activity) {
    originActivity.startActivity(this)
}