plugins {
    id("java")
    id("maven")
}

group = "com.henryfabio"
version = "1.0.1"

subprojects {

    plugins.apply("java")
    plugins.apply("maven")

    repositories {
        mavenCentral()
    }

    dependencies {
        val lombokVersion = "1.18.24"
        val jetbrainsAnnotationsVersion = "23.0.0"

        compileOnly("org.projectlombok:lombok:$lombokVersion")
        compileOnly("org.jetbrains:annotations:$jetbrainsAnnotationsVersion")

        annotationProcessor("org.projectlombok:lombok:$lombokVersion")
        annotationProcessor("org.jetbrains:annotations:$jetbrainsAnnotationsVersion")

        testImplementation("org.xerial:sqlite-jdbc:3.7.2")
        testImplementation("mysql:mysql-connector-java:8.0.31")
    }

}
