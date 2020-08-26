package com.octopus.ejplayground.common.networking

import io.ktor.client.engine.*
import io.ktor.client.engine.ios.*

actual val httpClientEngine: HttpClientEngine by lazy {
    Ios.create {
        configureRequest {
            setAllowsCellularAccess(true)
        }
    }
}