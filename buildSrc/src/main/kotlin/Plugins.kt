internal object PluginVersion {
    val gradle = "4.0.1"
    val kotlin = "1.4.0"
    val googleServices = "4.3.3"
    val crashlytics = "2.0.0"
    val firebasePerformance = "1.3.1"
    val navigationArgs = AndroidLibraryVersion.navigation
}

object Plugin {
    val gradle = "com.android.tools.build:gradle:${PluginVersion.gradle}"
    val kotlin = "org.jetbrains.kotlin:kotlin-gradle-plugin:${PluginVersion.kotlin}"
    val googleServices = "com.google.gms:google-services:${PluginVersion.googleServices}"
    val crashlytics = "com.google.firebase:firebase-crashlytics-gradle:${PluginVersion.crashlytics}"
    val firebasePerformance = "com.google.firebase:perf-plugin:${PluginVersion.firebasePerformance}"
    val navigationArgs = "androidx.navigation:navigation-safe-args-gradle-plugin:${PluginVersion.navigationArgs}"
}