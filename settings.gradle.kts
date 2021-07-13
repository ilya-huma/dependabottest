enableFeaturePreview("VERSION_CATALOGS")

rootProject.name = "Dependabottest"
include(":app")
include(":mylibrary")

dependencyResolutionManagement {
    versionCatalogs {
        create("libs") {

            version("groovy", "1.2.0")
            version("checkstyle", "8.37")
            alias("appCompat").to("androidx.appcompat", "appcompat").versionRef("groovy")
            alias("groovy-json").to("org.codehaus.groovy", "groovy-json").versionRef("groovy")
            alias("groovy-nio").to("org.codehaus.groovy", "groovy-nio").versionRef("groovy")
            alias("commons-lang3").to("org.apache.commons", "commons-lang3").version {
                strictly("[3.8, 4.0[")
                prefer("3.9")
            }
        }
    }
}