buildscript {
    repositories {
        gradlePluginPortal()
        jcenter()
        google()
        maven { url = uri("https://dl.bintray.com/kotlin/kotlin-eap") }
        maven { url = uri("https://kotlin.bintray.com/kotlinx") }
    }
    dependencies {
        classpath("org.jetbrains.kotlin:kotlin-gradle-plugin:1.4-M3")
        classpath("com.android.tools.build:gradle:4.0.0")
        classpath(Plugin.navigationArgs)
    }
}
group = "com.octopus.ejplayground"
version = "1.0-SNAPSHOT"

allprojects {
    repositories {
        mavenCentral()
        gradlePluginPortal()
        google()
        jcenter()
        maven { url = uri("https://dl.bintray.com/kotlin/kotlin-eap") }
        maven { url = uri("https://kotlin.bintray.com/kotlinx") }
    }
}
