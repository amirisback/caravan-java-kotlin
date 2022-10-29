import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

plugins {
    kotlin("jvm") version "1.7.10"
    application
}

group = "com.frogobox.caravan"
version = "1.0.0"

application {
    mainClass.set("Main")
}

repositories {
    mavenCentral()
    maven("https://jitpack.io")
}

dependencies {
    implementation("com.github.frogobox.frogo-sdk:frogocoresdk:2.0.9")
    testImplementation(kotlin("test"))
}

tasks.test {
    useJUnitPlatform()
}

tasks.withType<KotlinCompile> {
    kotlinOptions.jvmTarget = JavaVersion.VERSION_11.toString()
}

tasks.register("countdown") {
    println("This is the configuration phase")

    doFirst {
        println("3")
    }
    doFirst {
        println("This is the execution phase")
        println("4")
    }

    doLast {
        println("2")
    }
    doLast {
        println("1")
    }
}

tasks.register ("run-build-api", JavaExec::class.java) {
    description = "my task does something awesome"
    classpath = sourceSets["main"].runtimeClasspath
    // note the addition of "Kt" on the end of the class name.
    main = "app.Main"
}