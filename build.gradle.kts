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


val kotlinWrappersVersion = "0.0.1-pre.231-kotlin-1.5.21"
dependencies {
    implementation("org.jetbrains.kotlin-wrappers:kotlin-wrappers-bom:${kotlinWrappersVersion}")
    implementation("org.jetbrains.kotlin-wrappers:kotlin-react-router-dom")
    //implementation("org.sample:klib:1.3")
    /*implementation("org.jetbrains.kotlin-wrappers:kotlin-react")
    implementation("org.jetbrains.kotlin-wrappers:kotlin-react-dom")
    implementation("org.jetbrains.kotlin-wrappers:kotlin-react-table")
    implementation("org.jetbrains.kotlin-wrappers:kotlin-styled")*/
}