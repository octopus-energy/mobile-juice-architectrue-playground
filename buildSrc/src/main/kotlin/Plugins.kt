object PluginVersion {
    val gradle = "4.2.0-alpha08"
    val kotlin = "1.4.0"
    val navigationArgs = AndroidLibraryVersion.navigation
}

object Plugin {
    val gradle = "com.android.tools.build:gradle:${PluginVersion.gradle}"
    val kotlin = "org.jetbrains.kotlin:kotlin-gradle-plugin:${PluginVersion.kotlin}"
    val serialization = "org.jetbrains.kotlin:kotlin-serialization:${PluginVersion.kotlin}"
    val navigationArgs = "androidx.navigation:navigation-safe-args-gradle-plugin:${PluginVersion.navigationArgs}"
}