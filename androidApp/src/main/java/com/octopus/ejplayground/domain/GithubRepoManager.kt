package com.octopus.ejplayground.domain

import com.octopus.ejplayground.services.GithubService
import io.reactivex.Observable
import javax.inject.Inject

class GithubRepoManager @Inject constructor(
    private val githubService: GithubService
) {

    fun fetchSortedRepos(userName: String): Observable<List<GithubRepo>> {
        return githubService.fetchCodeRepos(userName)
            .sorted()
    }
}