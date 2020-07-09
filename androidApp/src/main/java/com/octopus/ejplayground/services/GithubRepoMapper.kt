package com.octopus.ejplayground.services

import com.octopus.ejplayground.GithubRepo
import javax.inject.Inject

class GithubRepoMapper @Inject constructor() {

    fun map(gitApiEntities: List<GithubRepoEntity>): List<GithubRepo> {
        return gitApiEntities.map { it.map() }
    }

    fun GithubRepoEntity.map(): GithubRepo {
        return GithubRepo(
            id = this.id,
            name = this.name,
            url = this.url
        )
    }
}