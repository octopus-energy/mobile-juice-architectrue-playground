package com.octopus.ejplayground.di

import com.octopus.ejplayground.common.SingleActivity
import com.octopus.ejplayground.common.platform.Announcer
import com.octopus.ejplayground.AndroidPlaygroundActivity
import com.octopus.ejplayground.common.platform.Navigator
import com.octopus.ejplayground.common.platform.AnnouncerImpl
import com.octopus.ejplayground.common.platform.NavigatorImpl
import com.octopus.ejplayground.githubrepositories.DetailsFragment
import com.octopus.ejplayground.githubrepositories.MainFragment
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
