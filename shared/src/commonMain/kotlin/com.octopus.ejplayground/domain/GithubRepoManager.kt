package com.octopus.ejplayground.domain

import com.octopus.ejplayground.MakeInjectable
import com.octopus.ejplayground.services.GithubService

class GithubRepoManager @MakeInjectable constructor(
    private val githubService: GithubService
) {

    suspend fun fetchSortedRepos(userName: String): List<GithubRepo> {
        return githubService.fetchCodeRepos(userName)
            .sortedBy { it.name }
    }
}