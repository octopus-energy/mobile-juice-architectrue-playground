package com.octopus.ejplayground.services

import io.ktor.client.features.json.*
import io.ktor.client.features.json.serializer.*
import kotlinx.serialization.json.Json
import kotlin.jvm.JvmName

const val GITHUB_BASE_URL: String = "https://api.github.com"

val ktorSerializer: JsonSerializer by lazy {
    val config = KotlinxSerializer.DefaultJsonConfiguration.copy(ignoreUnknownKeys = true)
    KotlinxSerializer(Json(config))
}