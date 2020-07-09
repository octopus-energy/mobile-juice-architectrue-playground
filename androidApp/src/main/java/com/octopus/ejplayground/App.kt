package com.octopus.ejplayground

import com.octopus.ejplayground.di.DaggerAndroidPlaygroundComponent
import dagger.android.AndroidInjector
import dagger.android.DaggerApplication

class App : DaggerApplication() {

    override fun applicationInjector(): AndroidInjector<App> {
        return DaggerAndroidPlaygroundComponent.builder()
                .build()
    }
}
