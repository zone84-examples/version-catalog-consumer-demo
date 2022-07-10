import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

@Suppress("DSL_SCOPE_VIOLATION") // workaround for IntelliJ bug with Gradle Version Catalogs DSL in plugins
plugins {
    id("application")
    alias(libs.plugins.kotlin.lang)
    alias(libs.plugins.kotlin.kapt)
    alias(libs.plugins.kotlin.allopen)
}

group = "tech.zone84.examples.sharedcatalog"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

application {
    mainClass.set("Application")
}

dependencies {
    implementation(libs.kotlin.reflect)
    implementation(libs.kotlin.stdlib)
    implementation(libs.kotlinlogging)
    runtimeOnly(libs.logback)
}

tasks.withType<KotlinCompile> {
    kotlinOptions.jvmTarget = libs.versions.jvm.get()
}
