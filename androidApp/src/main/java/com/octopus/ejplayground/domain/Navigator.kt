package com.octopus.ejplayground.domain

import com.octopus.ejplayground.services.GithubRepoEntity

interface Navigator {
    fun goToDetails(githubRepoEntity: GithubRepoEntity)
    fun goToUrl(url: String)
}