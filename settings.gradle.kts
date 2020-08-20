pluginManagement {
    repositories {
        mavenCentral()
        gradlePluginPortal()
        google()
        jcenter()
        maven { url = uri("https://dl.bintray.com/kotlin/kotlin-eap") }
        maven { url = uri("https://kotlin.bintray.com/kotlinx") }
    }
}
rootProject.name = "EJArchitectureResearchPlayground"


include(":shared")
include(":androidApp")

