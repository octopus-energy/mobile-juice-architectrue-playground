package com.octopus.ejplayground.di

import com.octopus.ejplayground.services.GithubService
import com.octopus.ejplayground.services.GithubServiceImpl
import dagger.Binds
import dagger.Module

@Module
interface ServicesModule {

    @Binds
    fun githubService(githubServiceImpl: GithubServiceImpl): GithubService
}