package com.octopus.ejplayground.common.platform

import com.octopus.ejplayground.githubrepositories.entities.GithubRepo

interface Navigator {
    fun goToDetails(githubRepo: GithubRepo)
    fun goToUrl(url: String)
    fun goToMain()
}