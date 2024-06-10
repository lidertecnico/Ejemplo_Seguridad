// Archivo de construcción a nivel superior donde puedes agregar opciones de configuración comunes a todos los subproyectos/módulos.
plugins {
    // Plugin para aplicaciones Android
    id("com.android.application") version "8.1.3" apply false
}

buildscript {
    repositories {
        // Repositorios donde Gradle buscará las dependencias
        // ...
        google()  // Asegúrate de tener esta línea para incluir el repositorio de Google
    }
    dependencies {
        // Dependencias del script de construcción
        // ...
        classpath("com.google.gms:google-services:4.4.2")  // Agrega esta línea para incluir el plugin de servicios de Google
    }
}
