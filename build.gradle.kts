import org.jetbrains.kotlin.gradle.tasks.KotlinCompile
import kotlinx.coroutines.*

plugins {
    kotlin("jvm") version "1.6.10"
    application
}

group = "me.diki"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    testImplementation(kotlin("test"))

}

tasks.test {
    useJUnit()
}

tasks.withType<KotlinCompile>() {
    kotlinOptions.jvmTarget = "1.8"
}

application {
    mainClassName = "MainKt"
}