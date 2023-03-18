enableFeaturePreview("VERSION_CATALOGS")

rootProject.name = "Dependabottest"
include(":app")
include(":mylibrary")

dependencyResolutionManagement {
    versionCatalogs {
        create("libs") {

            version("groovy", "1.6.1")
            version("checkstyle", "8.37")
            alias("appCompat").to("androidx.appcompat", "appcompat").versionRef("groovy")
            alias("recycler").to("androidx.recyclerview", "recyclerview").version("1.1.0")
        }
    }
}