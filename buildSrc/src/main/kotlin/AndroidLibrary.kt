internal object AndroidLibraryVersion {
    val appCompat = "1.1.0"
    val core = "1.0.2"
    val constraintLayout = "2.0.0-beta6"
    val fragment = "1.2.4"
    val material = "1.1.0"
    val navigation = "2.2.1"
    val lifecycleExtensions = "2.2.0"
    val dagger = "2.26"
    val curry = "0.1.5"
    val bindingCollectionAdapter = "3.1.1"
    val wasabeef = "3.0.0"
    val lottie = "3.3.0"
    val firebaseAnalytics = "17.2.1"
    val firebaseRemoteConfig = "19.1.2"
    val firebaseCrashlytics = "17.0.0"
    val firebasePerformance = "19.0.7"
    val coreKotlinExt = "1.2.0"
    val annotation = "1.1.0"
    val leakCanary = "2.3"
    val retrofit = "2.6.0"
    val glide = "4.11.0"
    val jUnit = "4.12"
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

    val navigation = "androidx.navigation:navigation-fragment-ktx:${AndroidLibraryVersion.navigation}"
    val navigationUi = "androidx.navigation:navigation-ui-ktx:${AndroidLibraryVersion.navigation}"

    val firebaseRemoteConfig = "com.google.firebase:firebase-config-ktx:${AndroidLibraryVersion.firebaseRemoteConfig}"
    val firebaseAnalytics = "com.google.firebase:firebase-analytics:${AndroidLibraryVersion.firebaseAnalytics}"
    val firebaseCrashlytics = "com.google.firebase:firebase-crashlytics:${AndroidLibraryVersion.firebaseCrashlytics}"
    val firebasePerformance = "com.google.firebase:firebase-perf:${AndroidLibraryVersion.firebasePerformance}"

    val coroutinesCore = KmpLibrary.coroutinesCore
    val coroutinesAndroid = "org.jetbrains.kotlinx:kotlinx-coroutines-android:${KmpLibraryVersion.coroutines}"
    val coroutinesRx2 = "org.jetbrains.kotlinx:kotlinx-coroutines-rx2:${KmpLibraryVersion.coroutines}"

    val dagger = "com.google.dagger:dagger:${AndroidLibraryVersion.dagger}"
    val daggerAndroid = "com.google.dagger:dagger-android:${AndroidLibraryVersion.dagger}"
    val daggerAndroidSupport = "com.google.dagger:dagger-android-support:${AndroidLibraryVersion.dagger}"
    val daggerCompiler = "com.google.dagger:dagger-compiler:${AndroidLibraryVersion.dagger}"
    val daggerAndroidCompiler = "com.google.dagger:dagger-android-processor:${AndroidLibraryVersion.dagger}"

    val retrofit = "com.squareup.retrofit2:retrofit:${AndroidLibraryVersion.retrofit}"
    val retrofitGson = "com.squareup.retrofit2:converter-gson:${AndroidLibraryVersion.retrofit}"

    val currencyConverter = "com.github.roadmaptravel:Curry:${AndroidLibraryVersion.curry}"
    val recyclerAnimators = "jp.wasabeef:recyclerview-animators:${AndroidLibraryVersion.wasabeef}"
    val bindingCollectionAdapter =
            "me.tatarka.bindingcollectionadapter2:bindingcollectionadapter:${AndroidLibraryVersion.bindingCollectionAdapter}"
    val bindngCollectionAdapterRecyclerView =
            "me.tatarka.bindingcollectionadapter2:bindingcollectionadapter-recyclerview:${AndroidLibraryVersion.bindingCollectionAdapter}"
    val lottie = "com.airbnb.android:lottie:${AndroidLibraryVersion.lottie}"
    val glide = "com.github.bumptech.glide:glide:${AndroidLibraryVersion.glide}"
    val glideCompiler = "com.github.bumptech.glide:compiler:${AndroidLibraryVersion.glide}"

    val leakCanary = "com.squareup.leakcanary:leakcanary-android:${AndroidLibraryVersion.leakCanary}"

    val jUnit = "junit:junit:${AndroidLibraryVersion.jUnit}"
}

