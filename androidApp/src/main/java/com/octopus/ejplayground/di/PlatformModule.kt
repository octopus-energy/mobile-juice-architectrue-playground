package com.octopus.ejplayground.di

import com.octopus.ejplayground.common.platform.LoggerImpl
import com.octopus.ejplayground.common.platform.Logger
import dagger.Binds
import dagger.Module

@Module
interface PlatformModule {

    @Binds
    fun logger(loggerImpl: LoggerImpl): Logger
}