object AndroidLibraryVersion {
    val appCompat = "1.1.0"
    val core = "1.0.2"
    val constraintLayout = "2.0.0-beta6"
    val fragment = "1.2.4"
    val material = "1.1.0"
    val navigation = "2.2.1"
    val lifecycleExtensions = "2.2.0"
    val dagger = "2.26"
    val coreKotlinExt = "1.2.0"
    val annotation = "1.1.0"
    val compose = "1.0.0-alpha01"
}

object AndroidLibrary {
    val javaInject = "javax.inject:javax.inject:1"

    val kotlin = "org.jetbrains.kotlin:kotlin-stdlib-jdk7:${PluginVersion.kotlin}"
    val appCompat = "androidx.appcompat:appcompat:${AndroidLibraryVersion.appCompat}"
    val core = "androidx.core:core-ktx:${AndroidLibraryVersion.core}"
    val fragment = "androidx.fragment:fragment:${AndroidLibraryVersion.fragment}"
    val material = "com.google.android.material:material:${AndroidLibraryVersion.material}"
    val constraintLayout = "androidx.constraintlayout:constraintlayout:${AndroidLibraryVersion.constraintLayout}"
    val lifecycleExtensions = "androidx.lifecycle:lifecycle-extensions:${AndroidLibraryVersion.lifecycleExtensions}"
    val databindingCompiler = "com.android.databinding:compiler:${PluginVersion.gradle}"
    val coreKotlinExt = "androidx.core:core-ktx:${AndroidLibraryVersion.coreKotlinExt}"
    val annotations = "androidx.annotation:annotation:${AndroidLibraryVersion.annotation}"

    val composeUi = "androidx.compose.ui:ui:${AndroidLibraryVersion.compose}"
    val composeMaterial = "androidx.compose.material:material:${AndroidLibraryVersion.compose}"
    val composeTooling = "androidx.ui:ui-tooling:${AndroidLibraryVersion.compose}"

    val navigation = "androidx.navigation:navigation-fragment-ktx:${AndroidLibraryVersion.navigation}"
    val navigationUi = "androidx.navigation:navigation-ui-ktx:${AndroidLibraryVersion.navigation}"

    val coroutinesCore = KmpLibrary.coroutinesCore
    val coroutinesAndroid = "org.jetbrains.kotlinx:kotlinx-coroutines-android:${KmpLibraryVersion.coroutines}"

    val dagger = "com.google.dagger:dagger:${AndroidLibraryVersion.dagger}"
    val daggerAndroid = "com.google.dagger:dagger-android:${AndroidLibraryVersion.dagger}"
    val daggerAndroidSupport = "com.google.dagger:dagger-android-support:${AndroidLibraryVersion.dagger}"
    val daggerCompiler = "com.google.dagger:dagger-compiler:${AndroidLibraryVersion.dagger}"
    val daggerAndroidCompiler = "com.google.dagger:dagger-android-processor:${AndroidLibraryVersion.dagger}"

    val ktorOkHttpEngine = "io.ktor:ktor-client-okhttp:${KmpLibraryVersion.ktor}"
}

