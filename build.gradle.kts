plugins {
    kotlin("js") version "1.5.0"
    id("org.jetbrains.dokka") version ("1.5.0")
}


kotlin {
    js(IR)
}


group = "org.example"
version = "1.0-SNAPSHOT"

repositories {
    mavenLocal()
    mavenCentral()
}


val kotlinWrappersVersion = "5.2.0-pre.204-kotlin-1.5.0"
dependencies {
    //implementation("org.jetbrains.kotlin-wrappers:kotlin-wrappers-bom:${kotlinWrappersVersion}")
    implementation("org.jetbrains.kotlin-wrappers:kotlin-react-router-dom:${kotlinWrappersVersion}")
    //implementation("org.sample:klib:1.3")
    /*implementation("org.jetbrains.kotlin-wrappers:kotlin-react")
    implementation("org.jetbrains.kotlin-wrappers:kotlin-react-dom")
    implementation("org.jetbrains.kotlin-wrappers:kotlin-react-table")
    implementation("org.jetbrains.kotlin-wrappers:kotlin-styled")*/
}