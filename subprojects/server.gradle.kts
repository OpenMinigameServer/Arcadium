repositories {
    // Airplane libs...
    maven("https://jitpack.io") {
        content { includeGroupByRegex("com\\.github\\..*") }
    }
}

dependencies {
}

java {
    sourceCompatibility = JavaVersion.VERSION_11
    targetCompatibility = JavaVersion.VERSION_11
}