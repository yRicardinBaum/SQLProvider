repositories {
    mavenCentral()
}

dependencies {
    val hikariVersion = "5.0.1"
    val slf4jVersion = "2.0.5"

    implementation("com.zaxxer:HikariCP:$hikariVersion")
    implementation("org.slf4j:slf4j-api:$slf4jVersion")
    implementation("org.slf4j:slf4j-simple:$slf4jVersion")
}
