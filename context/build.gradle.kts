plugins {
    `java-library`
}

val creekBaseVersion : String by extra
val creekPlatformVersion : String by extra
val creekObsVersion : String by extra
val spotBugsVersion : String by extra

dependencies {
    api(project(":extension"))
    api("org.creekservice:creek-base-annotation:$creekBaseVersion")
    api("org.creekservice:creek-base-type:$creekBaseVersion")

    implementation("org.creekservice:creek-observability-logging:$creekObsVersion")
    implementation("org.creekservice:creek-platform-resource:$creekPlatformVersion")
    implementation("com.github.spotbugs:spotbugs-annotations:$spotBugsVersion")
}
