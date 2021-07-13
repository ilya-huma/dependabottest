import com.dependa.Deps.AndroidX.okHttpVersion

plugins {
    id("com.android.application")
    id("kotlin-android")
}

apply("../config.gradle")

android {
    compileSdkVersion(30)
    buildToolsVersion("30.0.3")

    defaultConfig {
        applicationId("com.example.dependabottest")
        minSdkVersion(16)
        targetSdkVersion(30)
        versionCode(1)
        versionName("1.0")

        testInstrumentationRunner("androidx.test.runner.AndroidJUnitRunner")
    }

    compileOptions {
        sourceCompatibility(JavaVersion.VERSION_1_8)
        targetCompatibility(JavaVersion.VERSION_1_8)
    }
    kotlinOptions {
        jvmTarget = "1.8"
    }
}

dependencies {
    implementation("org.gradle:gradle-tooling-api:7.1")
    // The tooling API need an SLF4J implementation available at runtime, replace this with any other implementation
    runtimeOnly("org.slf4j:slf4j-simple:1.7.10")

    implementation("org.jetbrains.kotlin:kotlin-stdlib:1.5.0")
    implementation("androidx.core:core-ktx:1.6.0")
    runtimeOnly(libs.appCompat)
    implementation("com.squareup.okhttp3:okhttp:$okHttpVersion")
    implementation("com.google.android.material:material:1.4.0")
    testImplementation("junit:junit:4.13.2")

}