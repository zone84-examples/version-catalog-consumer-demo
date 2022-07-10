rootProject.name = "version-catalog-consumer-demo"

dependencyResolutionManagement {
    repositories {
        mavenLocal()
    }
    versionCatalogs {
        create("libs") {
            from("tech.zone84.examples.sharedcatalog:shared-version-catalog-demo:1.0-SNAPSHOT")
            version("kotlin", "1.7.0")
        }
    }
}
