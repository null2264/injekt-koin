plugins {
    alias(libs.plugins.kotlin.jvm)
    `maven-publish`
}

dependencies {
    implementation(libs.koin)
}

val ENV = System.getenv()

group = "io.github.null2264"

publishing {
    publications {
        create<MavenPublication>("maven") {
            groupId = project.group.toString()
            artifactId = "injekt-koin"
            version = "1.0-SNAPSHOT"
            pom {
                name = "Injekt-Koin"
                description = "Bridge between Injekt and Koin"
                url = "https://github.com/null2264/injekt-koin"

                licenses {
                    license {
                        name = "MIT"
                        url = "https://github.com/null2264/injekt-koin/blob/master/LICENSE"
                        distribution = "repo"
                    }
                }
            }
            from(components["kotlin"])
        }
    }

    repositories {
        if (ENV["MAVEN_URL"] != null) {
            maven {
                url = uri(ENV["MAVEN_URL"] ?: "")
                credentials {
                    username = ENV["MAVEN_USER"]
                    password = ENV["MAVEN_PASS"]
                }
            }
        }
    }
}
