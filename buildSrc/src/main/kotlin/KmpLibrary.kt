internal object KmpLibraryVersion {
    val serialisation = "1.0.0-RC"
    val coroutines = "1.3.9-native-mt"
    val ktor = "1.4.0"
}

object KmpLibrary {
    val serialisation = "org.jetbrains.kotlinx:kotlinx-serialization-core:${KmpLibraryVersion.serialisation}"
    val coroutinesCore = "org.jetbrains.kotlinx:kotlinx-coroutines-core:${KmpLibraryVersion.coroutines}"
    val ktor = "io.ktor:ktor-client-core:${KmpLibraryVersion.ktor}"
    val ktorJson = "io.ktor:ktor-client-json:${KmpLibraryVersion.ktor}"
    val ktorSerialisation = "io.ktor:ktor-client-serialization:${KmpLibraryVersion.ktor}"
}

