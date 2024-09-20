plugins {
    alias(libs.plugins.kotlin.jvm)
    `maven-publish`
}

dependencies {
    implementation(libs.koin)
}

publishing {
    publications {
        create<MavenPublication>("maven") {
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
}
