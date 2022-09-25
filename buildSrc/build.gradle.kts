plugins {
    `kotlin-dsl`
}

repositories {
    google()
    jcenter()
}

val kotlinVersion = "1.7.10" // Don't forget to update in Dependencies.kt too!

dependencies {
    implementation("com.android.tools.build:gradle:4.2.2")
    implementation("org.jetbrains.kotlin:kotlin-gradle-plugin:$kotlinVersion")
}
