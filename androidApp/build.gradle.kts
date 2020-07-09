plugins {
    id("com.android.application")
    kotlin("android")
    kotlin("kapt")
    id("kotlin-android-extensions")
    id("androidx.navigation.safeargs.kotlin")
}
group = "com.octopus.ejplayground"
version = "1.0-SNAPSHOT"

dependencies {
    implementation(project(":shared"))

    implementation(AndroidLibrary.kotlin)
    implementation(AndroidLibrary.coroutinesCore)
    implementation(AndroidLibrary.coroutinesAndroid)

    implementation(AndroidLibrary.appCompat)
    implementation(AndroidLibrary.core)
    implementation(AndroidLibrary.fragment)
    implementation(AndroidLibrary.material)
    implementation(AndroidLibrary.constraintLayout)
    implementation(AndroidLibrary.lifecycleExtensions)
    implementation(AndroidLibrary.coreKotlinExt)
    implementation(AndroidLibrary.navigation)
    implementation(AndroidLibrary.navigationUi)
    kapt(AndroidLibrary.databindingCompiler)

    implementation(AndroidLibrary.dagger)
    implementation(AndroidLibrary.daggerAndroid)
    implementation(AndroidLibrary.daggerAndroidSupport)
    kapt(AndroidLibrary.daggerCompiler)
    kapt(AndroidLibrary.daggerAndroidCompiler)

    implementation(AndroidLibrary.retrofit)
    implementation(AndroidLibrary.retrofitGson)
}

android {
    compileSdkVersion(Config.compileSdk)
    defaultConfig {
        applicationId = "com.octopus.ejplayground"
        minSdkVersion(Config.minSdk)
        targetSdkVersion(Config.targetSdk)
        versionCode = Config.versionCode
        versionName = Config.versionName
    }
    buildTypes {
        getByName("release") {
            isMinifyEnabled = false
        }
    }
    kotlinOptions {
        jvmTarget = JavaVersion.VERSION_1_8.toString()
        freeCompilerArgs = freeCompilerArgs + "-Xopt-in=kotlin.ExperimentalStdlibApi"
        freeCompilerArgs = freeCompilerArgs + "-Xopt-in=kotlinx.coroutines.ExperimentalCoroutinesApi"
        freeCompilerArgs = freeCompilerArgs + "-Xopt-in=kotlinx.coroutines.FlowPreview"
        freeCompilerArgs = freeCompilerArgs + "-Xopt-in=kotlin.time.ExperimentalTime"
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }
    kotlinOptions {
        jvmTarget = JavaVersion.VERSION_1_8.toString()
    }
}