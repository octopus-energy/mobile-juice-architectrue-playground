package com.octopus.ejplayground.di

import com.octopus.ejplayground.LoggerImpl
import com.octopus.ejplayground.domain.GithubService
import com.octopus.ejplayground.domain.Logger
import com.octopus.ejplayground.services.GithubServiceImpl
import dagger.Binds
import dagger.Module

@Module
interface PlatformModule {

    @Binds
    fun logger(loggerImpl: LoggerImpl): Logger
}