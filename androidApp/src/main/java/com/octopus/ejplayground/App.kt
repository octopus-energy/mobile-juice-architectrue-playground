package com.octopus.ejplayground

import com.octopus.ejplayground.di.DaggerAndroidPlaygroundComponent
import com.octopus.ejplayground.services.GithubService
import dagger.android.AndroidInjector
import dagger.android.DaggerApplication
import javax.inject.Inject

class App : DaggerApplication() {

    override fun applicationInjector(): AndroidInjector<App> {
        return DaggerAndroidPlaygroundComponent.builder()
                .build()
    }
}
