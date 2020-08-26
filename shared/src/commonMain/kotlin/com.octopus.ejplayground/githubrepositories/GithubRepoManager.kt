package com.octopus.ejplayground.githubrepositories

import com.octopus.ejplayground.githubrepositories.services.github.GithubService
import com.octopus.ejplayground.common.MakeInjectable
import com.octopus.ejplayground.githubrepositories.entities.GithubRepo

class GithubRepoManager @MakeInjectable constructor(
    private val githubService: GithubService
) {

    suspend fun fetchSortedRepos(userName: String): List<GithubRepo> {
        return githubService.fetchCodeRepos(userName)
            .sortedBy { it.name }
    }
}