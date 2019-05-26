plugins {
    kotlin("multiplatform") version "1.3.30"
}

repositories {
    mavenCentral()
}


kotlin {
    linuxX64("native") {
        binaries {
            executable()
        }
    }

    sourceSets {
        val nativeMain by getting {
            dependencies {
                implementation("org.jetbrains.kotlinx:kotlinx-coroutines-core-native:1.2.1")
            }
        }

    }


}

tasks.withType<Wrapper> {
  gradleVersion = "5.3.1"
  distributionType = Wrapper.DistributionType.ALL
}