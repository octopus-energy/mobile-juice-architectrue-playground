package com.octopus.ejplayground.services

import com.octopus.ejplayground.domain.GithubRepo
import io.reactivex.Observable
import javax.inject.Inject

class GithubService @Inject constructor(
    private val githubApiBuilder: GithubApiBuilder,
    private val githubRepoMapper: GithubRepoMapper
) {

    private val githubApi: GitHubApi = githubApiBuilder.buildApi()

    fun fetchCodeRepos(username: String): Observable<List<GithubRepo>> {
        return githubApi.fetchCodeRepos(username)
            .map { githubRepoMapper.map(it) }
    }
}