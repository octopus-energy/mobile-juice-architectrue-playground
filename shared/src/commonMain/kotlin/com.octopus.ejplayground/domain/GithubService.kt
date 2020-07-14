package com.octopus.ejplayground.domain

import com.octopus.ejplayground.domain.GithubRepo

interface GithubService {

    suspend fun fetchCodeRepos(username: String): List<GithubRepo>
}