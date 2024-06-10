package aplicacionesmoviles.avanzado.todosalau.ejemploseguridad;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    private Button authenticationButton; // Botón para la actividad de autenticación
    private Button authorizationButton; // Botón para la actividad de autorización
    private Button dataProtectionButton; // Botón para la actividad de protección de datos

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Inicializar los botones de la interfaz de usuario
        authenticationButton = findViewById(R.id.authentication_button);
        authorizationButton = findViewById(R.id.authorization_button);
        dataProtectionButton = findViewById(R.id.data_protection_button);

        // Configurar el listener para el botón de autenticación
        authenticationButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Crear un Intent para iniciar la actividad de autenticación
                Intent intent = new Intent(MainActivity.this, AuthenticationActivity.class);
                startActivity(intent);
            }
        });

        // Configurar el listener para el botón de autorización
        authorizationButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Crear un Intent para iniciar la actividad de autorización
                Intent intent = new Intent(MainActivity.this, AuthorizationActivity.class);
                startActivity(intent);
            }
        });

        // Configurar el listener para el botón de protección de datos
        dataProtectionButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Crear un Intent para iniciar la actividad de protección de datos
                Intent intent = new Intent(MainActivity.this, DataProtectionActivity.class);
                startActivity(intent);
            }
        });
    }
}