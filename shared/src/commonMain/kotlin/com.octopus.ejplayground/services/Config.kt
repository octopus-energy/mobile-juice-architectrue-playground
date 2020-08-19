package com.octopus.ejplayground.services

import io.ktor.client.features.json.*
import io.ktor.client.features.json.serializer.*
import kotlinx.serialization.json.Json

const val GITHUB_BASE_URL: String = "https://api.github.com"

val ktorSerializer: JsonSerializer by lazy {
    val config = Json {
        ignoreUnknownKeys = true
    }
    KotlinxSerializer(config)
}