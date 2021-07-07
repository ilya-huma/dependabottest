
object Deps {

    const val compileSdkVersion = 30
    const val buildToolsVersion = "30.0.3"
    const val targetSdkVersion = 30

    object Kotlin {
        const val version = "1.5.0"

        const val stdLib = "org.jetbrains.kotlin:kotlin-stdlib:$version"
        const val coroutine = "org.jetbrains.kotlinx:kotlinx-coroutines-core:1.5.0"
        const val coroutineRx2 = "org.jetbrains.kotlinx:kotlinx-coroutines-rx2:1.5.0"
    }

    object AndroidX {

        const val navVersion = "2.3.4"
        private const val lifecycleVersion = "2.3.1"
        private const val workVersion = "2.5.0"
        private const val cameraVersion = "1.0.0"
        private const val roomVersion = "2.3.0"

        const val coreKtx = "androidx.core:core-ktx:1.3.2"
        const val appCompat = "androidx.appcompat:appcompat:1.2.0"
        const val navFragment = "androidx.navigation:navigation-fragment-ktx:$navVersion"
        const val navUI = "androidx.navigation:navigation-ui-ktx:$navVersion"
        const val browser = "androidx.browser:browser:1.3.0"
        const val constraint = "androidx.constraintlayout:constraintlayout:2.0.4"
        const val recycler = "androidx.recyclerview:recyclerview:1.2.0"
        const val coordinator = "androidx.coordinatorlayout:coordinatorlayout:1.1.0"
        const val emoji = "androidx.emoji:emoji:1.1.0"
        const val legacy = "androidx.legacy:legacy-support-v4:1.0.0"
        const val viewModel = "androidx.lifecycle:lifecycle-viewmodel-ktx:$lifecycleVersion"
        const val liveData = "androidx.lifecycle:lifecycle-livedata-ktx:$lifecycleVersion"
        const val lifecycleCommon = "androidx.lifecycle:lifecycle-common-java8:$lifecycleVersion"
        const val work = "androidx.work:work-runtime-ktx:$workVersion"
        const val media = "androidx.media:media:1.3.0"
        const val vectorDrawable = "androidx.vectordrawable:vectordrawable:1.1.0"


        const val camera = "androidx.camera:camera-camera2:$cameraVersion"
        const val cameraLifecycle = "androidx.camera:camera-lifecycle:$cameraVersion"
        const val cameraView = "androidx.camera:camera-view:1.0.0-alpha12"
        const val cameraExtensions = "androidx.camera:camera-extensions:1.0.0-alpha12"

        const val room = "androidx.room:room-runtime:$roomVersion"
        const val roomCompiler = "androidx.room:room-compiler:$roomVersion"
        const val roomKtx = "androidx.room:room-ktx:$roomVersion"
        const val sqliteJdbc = "org.xerial:sqlite-jdbc:3.34.0"

        const val viewBinding = "androidx.databinding:viewbinding:4.0.0-alpha07"
    }
    }