package com.octopus.ejplayground.di

import com.octopus.ejplayground.SingleActivity
import com.octopus.ejplayground.domain.Announcer
import com.octopus.ejplayground.ui.AndroidPlaygroundActivity
import com.octopus.ejplayground.domain.Navigator
import com.octopus.ejplayground.ui.AnnouncerImpl
import com.octopus.ejplayground.ui.NavigatorImpl
import com.octopus.ejplayground.ui.DetailsFragment
import com.octopus.ejplayground.ui.MainFragment
import dagger.Binds
import dagger.Module
import dagger.android.ContributesAndroidInjector

@Module
interface SingleActivityModule {

    @SingleActivity
    @ContributesAndroidInjector(
            modules = [
                FragmentModule::class,
                ActivityScopedModule::class
            ]
    )
    fun androidPlaygroundActivity(): AndroidPlaygroundActivity
}

@Module
interface FragmentModule {

    @ContributesAndroidInjector
    fun mainFragment(): MainFragment

    @ContributesAndroidInjector
    fun detailsFragment(): DetailsFragment
}

@Module
interface ActivityScopedModule {

    @Binds
    fun navigator(navigatorImpl: NavigatorImpl): Navigator

    @Binds
    fun announcer(announcerImpl: AnnouncerImpl): Announcer
}
