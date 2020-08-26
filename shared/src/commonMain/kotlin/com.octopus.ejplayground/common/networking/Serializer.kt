package com.octopus.ejplayground.common.networking

import io.ktor.client.features.json.*
import io.ktor.client.features.json.serializer.*
import kotlinx.serialization.json.Json

val ktorSerializer: JsonSerializer by lazy {
    val config = Json {
        ignoreUnknownKeys = true
    }
    KotlinxSerializer(config)
}