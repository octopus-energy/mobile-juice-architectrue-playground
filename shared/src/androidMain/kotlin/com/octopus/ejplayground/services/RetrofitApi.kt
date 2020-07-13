package com.octopus.ejplayground.services

import com.octopus.ejplayground.services.GithubRepoEntity
import retrofit2.http.GET
import retrofit2.http.Path

interface GitHubApi {
    @GET("/users/{user}/repos")
    suspend fun fetchCodeRepos(@Path("user") user: String): List<GithubRepoEntity>
}