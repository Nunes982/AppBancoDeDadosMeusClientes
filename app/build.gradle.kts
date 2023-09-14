plugins {
    id("com.android.application")
    id("realm-android")
}

android {
    namespace = "exemplo.com.andersonnunes.appbancodedadosmeusclientes"
    compileSdk = 33

    defaultConfig {
        applicationId = "exemplo.com.andersonnunes.appbancodedadosmeusclientes"
        minSdk = 26
        targetSdk = 33
        versionCode = 1
        versionName = "1.0"

    }

    buildTypes {
        release {
            isMinifyEnabled = false
            proguardFiles(
                getDefaultProguardFile("proguard-android-optimize.txt"),
                "proguard-rules.pro"
            )
        }
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }
}

dependencies {

    implementation("io.realm:realm-gradle-plugin:10.11.1")
    implementation("androidx.appcompat:appcompat:1.6.1")
    implementation("com.google.android.material:material:1.9.0")
    implementation("androidx.constraintlayout:constraintlayout:2.1.4")
}