package com.octopus.ejplayground.domain

interface Navigator {
    fun goToDetails(githubRepo: GithubRepo)
    fun goToUrl(url: String)
    fun goToMain()
}