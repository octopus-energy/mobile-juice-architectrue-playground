plugins {
    id("com.android.application")
    kotlin("android")
    kotlin("kapt")
    id("kotlin-android-extensions")
    id("androidx.navigation.safeargs.kotlin")
}
group = "com.octopus.ejplayground"
version = "1.0-SNAPSHOT"

repositories {
    gradlePluginPortal()
    google()
    jcenter()
    mavenCentral()
    maven {
        url = uri("https://dl.bintray.com/kotlin/kotlin-eap")
    }
}

dependencies {
    implementation(project(":shared"))

    implementation(Library.kotlin)
    implementation(Library.coroutinesCore)
    implementation(Library.coroutinesAndroid)
    implementation(Library.coroutinesRx2)

    implementation(Library.appCompat)
    implementation(Library.core)
    implementation(Library.fragment)
    implementation(Library.material)
    implementation(Library.constraintLayout)
    implementation(Library.lifecycleExtensions)
    implementation(Library.coreKotlinExt)
    implementation(Library.navigation)
    implementation(Library.navigationUi)
    kapt(Library.databindingCompiler)

    implementation(Library.dagger)
    implementation(Library.daggerAndroid)
    implementation(Library.daggerAndroidSupport)
    kapt(Library.daggerCompiler)
    kapt(Library.daggerAndroidCompiler)

    implementation(Library.retrofit)
    implementation(Library.retrofitGson)
    implementation(Library.retrofitRx)

    implementation(Library.rxJava)
    implementation(Library.rxAndroid)
}

android {
    compileSdkVersion(29)
    defaultConfig {
        applicationId = "com.octopus.ejplayground"
        minSdkVersion(24)
        targetSdkVersion(29)
        versionCode = 1
        versionName = "1.0"
    }
    buildTypes {
        getByName("release") {
            isMinifyEnabled = false
        }
    }
    kotlinOptions {
        jvmTarget = JavaVersion.VERSION_1_8.toString()
    }
}