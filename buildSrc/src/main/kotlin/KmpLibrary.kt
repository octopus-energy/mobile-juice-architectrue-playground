internal object KmpLibraryVersion {
    val serialisation = "0.20.0-1.4-M3"
    val coroutines = "1.3.7-1.4-M3"
    val ktor = "1.3.2-1.4-M3"
}

object KmpLibrary {
    val serialisation = "org.jetbrains.kotlinx:kotlinx-serialization-runtime:${KmpLibraryVersion.serialisation}"
    val coroutinesCore = "org.jetbrains.kotlinx:kotlinx-coroutines-core:${KmpLibraryVersion.coroutines}"
    val ktor = "io.ktor:ktor-client-core:${KmpLibraryVersion.ktor}"
    val ktorJson = "io.ktor:ktor-client-json:${KmpLibraryVersion.ktor}"
    val ktorSerialisation = "io.ktor:ktor-client-serialization:${KmpLibraryVersion.ktor}"
}

