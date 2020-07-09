package com.octopus.ejplayground.services

import com.octopus.ejplayground.GithubRepo
import javax.inject.Inject

class GithubService @Inject constructor(
    private val githubApiBuilder: GithubApiBuilder,
    private val githubRepoMapper: GithubRepoMapper
) {

    private val githubApi: GitHubApi = githubApiBuilder.buildApi()

    suspend fun fetchCodeRepos(username: String): List<GithubRepo> {
        return githubRepoMapper.map(githubApi.fetchCodeRepos(username))
    }
}