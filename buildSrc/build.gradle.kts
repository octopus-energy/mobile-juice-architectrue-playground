plugins {
    `kotlin-dsl`
}

repositories {
    jcenter()
}

/**
 * Fixes a problem in Android Studio 4.2-alpha08. Can remove when the issue is fixed.
 *
 * @see https://issuetracker.google.com/issues/166468915
 */
dependencies {
    implementation("org.jetbrains.kotlin:kotlin-stdlib:1.4.0")
}