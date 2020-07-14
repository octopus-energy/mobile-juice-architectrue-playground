package com.octopus.ejplayground.services

import io.ktor.client.engine.*
import io.ktor.client.engine.ios.*

actual val httpClientEngine: HttpClientEngine by lazy {
    Ios.create {
        configureRequest {
            setAllowsCellularAccess(true)
        }
    }
}