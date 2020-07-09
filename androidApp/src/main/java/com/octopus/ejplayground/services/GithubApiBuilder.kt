package com.octopus.ejplayground.services

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import javax.inject.Inject

class GithubApiBuilder @Inject constructor() {

    fun buildApi(): GitHubApi {
        val builder = Retrofit.Builder()
                .addConverterFactory(GsonConverterFactory.create())
                .baseUrl(GITHUB_BASE_URL)
                .build()
        return builder.create(GitHubApi::class.java)
    }
}