internal object LibraryVersion {
    val appCompat = "1.1.0"
    val core = "1.0.2"
    val constraintLayout = "2.0.0-beta6"
    val fragment = "1.2.4"
    val material = "1.1.0"
    val navigation = "2.2.1"
    val lifecycleExtensions = "2.2.0"
    val dagger = "2.26"
    val coroutines = "1.3.4"
    val curry = "0.1.5"
    val bindingCollectionAdapter = "3.1.1"
    val wasabeef = "3.0.0"
    val lottie = "3.3.0"
    val firebaseAnalytics = "17.2.1"
    val firebaseRemoteConfig = "19.1.2"
    val firebaseCrashlytics = "17.0.0"
    val firebasePerformance = "19.0.7"
    val coreKotlinExt = "1.2.0"
    val leakCanary = "2.3"
    val retrofit = "2.5.0"
    val rxJava = "2.2.9"
    val rxAndroid = "2.1.1"
    val glide = "4.11.0"
    val jUnit = "4.12"
}

object Library {
    val kotlin = "org.jetbrains.kotlin:kotlin-stdlib-jdk7:${PluginVersion.kotlin}"
    val appCompat = "androidx.appcompat:appcompat:${LibraryVersion.appCompat}"
    val core = "androidx.core:core-ktx:${LibraryVersion.core}"
    val fragment = "androidx.fragment:fragment:${LibraryVersion.fragment}"
    val material = "com.google.android.material:material:${LibraryVersion.material}"
    val constraintLayout = "androidx.constraintlayout:constraintlayout:${LibraryVersion.constraintLayout}"
    val lifecycleExtensions = "androidx.lifecycle:lifecycle-extensions:${LibraryVersion.lifecycleExtensions}"
    val databindingCompiler = "com.android.databinding:compiler:${PluginVersion.gradle}"
    val coreKotlinExt = "androidx.core:core-ktx:${LibraryVersion.coreKotlinExt}"

    val navigation = "androidx.navigation:navigation-fragment-ktx:${LibraryVersion.navigation}"
    val navigationUi = "androidx.navigation:navigation-ui-ktx:${LibraryVersion.navigation}"

    val firebaseRemoteConfig = "com.google.firebase:firebase-config-ktx:${LibraryVersion.firebaseRemoteConfig}"
    val firebaseAnalytics = "com.google.firebase:firebase-analytics:${LibraryVersion.firebaseAnalytics}"
    val firebaseCrashlytics = "com.google.firebase:firebase-crashlytics:${LibraryVersion.firebaseCrashlytics}"
    val firebasePerformance = "com.google.firebase:firebase-perf:${LibraryVersion.firebasePerformance}"

    val coroutinesCore = "org.jetbrains.kotlinx:kotlinx-coroutines-core:${LibraryVersion.coroutines}"
    val coroutinesAndroid = "org.jetbrains.kotlinx:kotlinx-coroutines-android:${LibraryVersion.coroutines}"
    val coroutinesRx2 = "org.jetbrains.kotlinx:kotlinx-coroutines-rx2:${LibraryVersion.coroutines}"

    val dagger = "com.google.dagger:dagger:${LibraryVersion.dagger}"
    val daggerAndroid = "com.google.dagger:dagger-android:${LibraryVersion.dagger}"
    val daggerAndroidSupport = "com.google.dagger:dagger-android-support:${LibraryVersion.dagger}"
    val daggerCompiler = "com.google.dagger:dagger-compiler:${LibraryVersion.dagger}"
    val daggerAndroidCompiler = "com.google.dagger:dagger-android-processor:${LibraryVersion.dagger}"

    val retrofit = "com.squareup.retrofit2:retrofit:${LibraryVersion.retrofit}"
    val retrofitGson = "com.squareup.retrofit2:converter-gson:${LibraryVersion.retrofit}"
    val retrofitRx = "com.squareup.retrofit2:adapter-rxjava2:${LibraryVersion.retrofit}"

    val rxJava = "io.reactivex.rxjava2:rxjava:${LibraryVersion.rxJava}"
    val rxAndroid = "io.reactivex.rxjava2:rxandroid:${LibraryVersion.rxAndroid}"

    val currencyConverter = "com.github.roadmaptravel:Curry:${LibraryVersion.curry}"
    val recyclerAnimators = "jp.wasabeef:recyclerview-animators:${LibraryVersion.wasabeef}"
    val bindingCollectionAdapter =
            "me.tatarka.bindingcollectionadapter2:bindingcollectionadapter:${LibraryVersion.bindingCollectionAdapter}"
    val bindngCollectionAdapterRecyclerView =
            "me.tatarka.bindingcollectionadapter2:bindingcollectionadapter-recyclerview:${LibraryVersion.bindingCollectionAdapter}"
    val lottie = "com.airbnb.android:lottie:${LibraryVersion.lottie}"
    val glide = "com.github.bumptech.glide:glide:${LibraryVersion.glide}"
    val glideCompiler = "com.github.bumptech.glide:compiler:${LibraryVersion.glide}"

    val leakCanary = "com.squareup.leakcanary:leakcanary-android:${LibraryVersion.leakCanary}"

    val jUnit = "junit:junit:${LibraryVersion.jUnit}"
}

