package com.octopus.ejplayground.services

import com.octopus.ejplayground.domain.GithubRepo
import javax.inject.Inject

class GithubServiceImpl @Inject constructor(
    private val githubApiBuilder: GithubApiBuilder,
    private val githubRepoMapper: GithubRepoMapper
) : GithubService {

    private val githubApi: GitHubApi = githubApiBuilder.buildApi()

    override suspend fun fetchCodeRepos(username: String): List<GithubRepo> {
        return githubRepoMapper.map(githubApi.fetchCodeRepos(username))
    }
}