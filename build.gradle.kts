import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

plugins {
    kotlin("jvm") version "1.8.21"
    application
}

group = "com.frogobox.caravan"
version = "1.0.0"

application {
    mainClass.set("Main")
}

repositories {
    google()
    mavenCentral()
    maven("https://jitpack.io")
}

dependencies {
    implementation("com.github.frogobox.frogo-sdk:core-sdk:2.2.2")
    testImplementation(kotlin("test"))
}

tasks.test {
    useJUnitPlatform()
}

tasks.withType<KotlinCompile> {
    kotlinOptions {
        jvmTarget = "17"
    }
}

tasks.register ("run-build-api", JavaExec::class.java) {
    description = "my task does something awesome"
    classpath = sourceSets["main"].runtimeClasspath
    // note the addition of "Kt" on the end of the class name.
    main = "app.CreateApiKt"
}

tasks.register ("run-main-kotlin", JavaExec::class.java) {
    description = "my task does something awesome"
    classpath = sourceSets["main"].runtimeClasspath
    // note the addition of "Kt" on the end of the class name.
    main = "app.MainKt"
}

tasks.register ("run-main-java", JavaExec::class.java) {
    description = "my task does something awesome"
    classpath = sourceSets["main"].runtimeClasspath
    // note the addition of "Kt" on the end of the class name.
    main = "app.Main"
}