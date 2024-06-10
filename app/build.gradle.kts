plugins {
    id("com.android.application")
    id("com.google.gms.google-services")  //añadir este plugin
}

android {
    namespace = "aplicacionesmoviles.avanzado.todosalau.ejemploseguridad"
    compileSdk = 34

    defaultConfig {
        applicationId = "aplicacionesmoviles.avanzado.todosalau.ejemploseguridad"
        minSdk = 34
        targetSdk = 34
        versionCode = 1
        versionName = "1.0"

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
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

    // Compatibilidad con versiones anteriores de Android
    implementation("androidx.appcompat:appcompat:1.7.0")

    // Biblioteca de componentes de diseño de Material de Google
    implementation("com.google.android.material:material:1.12.0")

    // Biblioteca para diseñar layouts con ConstraintLayout
    implementation("androidx.constraintlayout:constraintlayout:2.1.4")

    // Firebase Authentication para manejar la autenticación de usuarios
    implementation("com.google.firebase:firebase-auth:23.0.0")  // Add Firebase Authentication

    // Google Sign-In para autenticar usuarios con sus cuentas de Google
    implementation("com.google.android.gms:play-services-auth:21.2.0")  // Add Google Sign-In

    // Biblioteca Glide para cargar y mostrar imágenes
    implementation("com.github.bumptech.glide:glide:4.12.0")

    // Manejo del ciclo de vida de actividades
    implementation("androidx.activity:activity:1.9.0")

    // Manejo del ciclo de vida de fragmentos
    implementation("androidx.fragment:fragment:1.7.1")

    // Soporte para las nuevas API de credenciales de Android
    implementation("androidx.credentials:credentials:1.2.2")

    // Dependencia para pruebas unitarias con JUnit
    testImplementation("junit:junit:4.13.2")

    // Procesador de anotaciones para Glide
    annotationProcessor("com.github.bumptech.glide:compiler:4.12.0")

    // Dependencias para pruebas instrumentadas con AndroidX Test y Espresso
    androidTestImplementation("androidx.test.ext:junit:1.1.5")
    androidTestImplementation("androidx.test.espresso:espresso-core:3.5.1")
}
