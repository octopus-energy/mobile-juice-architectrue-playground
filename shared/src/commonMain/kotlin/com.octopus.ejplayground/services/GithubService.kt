package com.octopus.ejplayground.services

import com.octopus.ejplayground.domain.GithubRepo

interface GithubService {

    suspend fun fetchCodeRepos(username: String): List<GithubRepo>
}