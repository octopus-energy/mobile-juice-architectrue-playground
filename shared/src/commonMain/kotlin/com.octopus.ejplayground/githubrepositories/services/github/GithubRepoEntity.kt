package com.octopus.ejplayground.githubrepositories.services.github

import kotlinx.serialization.Serializable

@Serializable
data class GithubRepoEntity(
        val id: Int,
        val name: String,
        val url: String
)
