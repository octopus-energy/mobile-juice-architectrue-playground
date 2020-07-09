package com.octopus.ejplayground

import com.octopus.ejplayground.di.DaggerAndroidPlaygroundComponent
import dagger.android.AndroidInjector
import dagger.android.DaggerApplication
import javax.inject.Inject

class App : DaggerApplication() {

    @Inject lateinit var testInjection: TestInjection

    override fun applicationInjector(): AndroidInjector<App> {
        return DaggerAndroidPlaygroundComponent.builder()
                .build()
    }
}
