plugins {
    id("com.android.application")
}

android {
    namespace = "com.example.assignment3_1"
    compileSdk = 35

    defaultConfig {
        applicationId = "com.example.assignment3_1"
        minSdk = 35
        targetSdk = 35
        versionCode = 1
        versionName = "1.0"

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
    }

    buildTypes {
        release {
            isMinifyEnabled = false
            proguardFiles(getDefaultProguardFile("proguard-android-optimize.txt"), "proguard-rules.pro")
        }
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }
}

dependencies {
    implementation(fileTree(dir = "libs", include = listOf("*.jar")))

    androidTestImplementation("com.android.support.test.espresso:espresso-core:2.2.2") {
        exclude(group = "com.android.support", module = "support-annotations")
    }

    implementation("androidx.appcompat:appcompat:1.7.0")

    testImplementation("junit:junit:4.12")

    implementation("com.journeyapps:zxing-android-embedded:3.4.0")

}