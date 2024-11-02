plugins {
    id 'org.jetbrains.kotlin.jvm' version '1.9.25'
    id 'org.jetbrains.kotlin.plugin.spring' version '1.9.25'
    id 'org.springframework.boot' version '3.3.5'
    id 'io.spring.dependency-management' version '1.1.6'
}

group = "com.heroku"
version = "1.0.0-SNAPSHOT"
java.sourceCompatibility = JavaVersion.VERSION_17
java.targetCompatibility = JavaVersion.VERSION_17

repositories {
    mavenCentral()
}

dependencies {
    implementation("org.springframework.boot:spring-boot-starter")
    implementation("org.springframework.boot:spring-boot-starter-web")
    implementation 'com.fasterxml.jackson.module:jackson-module-kotlin'
    implementation 'org.jetbrains.kotlin:kotlin-reflect'
    implementation "de.smartsquare:mqtt-starter:0.17.0"
    compileOnly 'org.projectlombok:lombok'
    annotationProcessor 'org.projectlombok:lombok'
    testImplementation 'org.springframework.boot:spring-boot-starter-test'
    testImplementation 'org.jetbrains.kotlin:kotlin-test-junit5'
    testRuntimeOnly 'org.junit.platform:junit-platform-launcher'
}
