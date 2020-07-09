package com.octopus.ejplayground.domain

import com.octopus.ejplayground.GithubRepo

interface Navigator {
    fun goToDetails(githubRepo: GithubRepo)
    fun goToUrl(url: String)
}