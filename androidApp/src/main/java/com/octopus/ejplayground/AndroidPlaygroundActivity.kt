package com.octopus.ejplayground

import android.os.Bundle
import com.octopus.ejplayground.R
import dagger.android.support.DaggerAppCompatActivity

class AndroidPlaygroundActivity : DaggerAppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_android_playground)
    }
}