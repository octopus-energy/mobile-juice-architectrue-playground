package com.octopus.ejplayground.domain

import kotlinx.serialization.Serializable

@Serializable
data class GithubRepo(
    val id: Int,
    val name: String,
    val url: String
)