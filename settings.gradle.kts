pluginManagement {
    repositories {
        mavenCentral()
        gradlePluginPortal()
        google()
        jcenter()
        maven { url = uri("https://kotlin.bintray.com/kotlinx") }
    }
}
rootProject.name = "EJArchitectureResearchPlayground"


include(":shared")
include(":androidApp")

