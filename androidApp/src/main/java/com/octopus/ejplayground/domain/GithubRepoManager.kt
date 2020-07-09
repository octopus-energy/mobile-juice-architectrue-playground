package com.octopus.ejplayground.domain

import com.octopus.ejplayground.GithubRepo
import com.octopus.ejplayground.services.GithubService
import javax.inject.Inject

class GithubRepoManager @Inject constructor(
    private val githubService: GithubService
) {

    suspend fun fetchSortedRepos(userName: String): List<GithubRepo> {
        return githubService.fetchCodeRepos(userName)
            .sortedBy { it.name }
    }
}