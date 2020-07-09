package com.octopus.ejplayground.services

import retrofit2.http.GET
import retrofit2.http.Path

const val GITHUB_BASE_URL: String = "https://api.github.com/"

interface GitHubApi {
    @GET("/users/{user}/repos")
    suspend fun fetchCodeRepos(@Path("user") user: String): List<GithubRepoEntity>
}