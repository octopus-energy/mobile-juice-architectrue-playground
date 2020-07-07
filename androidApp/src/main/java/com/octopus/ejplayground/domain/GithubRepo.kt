package com.octopus.ejplayground.domain

import java.io.Serializable

data class GithubRepo(
    val id: Int,
    val name: String,
    val url: String
) : Serializable