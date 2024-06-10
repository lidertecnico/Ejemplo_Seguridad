package aplicacionesmoviles.avanzado.todosalau.ejemploseguridad;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class DataProtectionActivity extends AppCompatActivity {

    private TextView dataProtectionExplanation; // TextView para mostrar la explicación de la protección de datos
    private Button backButton; // Botón para volver atrás

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_data_protection);

        // Inicializar los elementos de la interfaz de usuario
        dataProtectionExplanation = findViewById(R.id.data_protection_explanation);
        backButton = findViewById(R.id.back_button);

        // Establecer el texto explicativo sobre la protección de datos
        dataProtectionExplanation.setText("La protección de datos y la privacidad son fundamentales para garantizar que la información personal " +
                "de los usuarios esté segura. Las mejores prácticas incluyen el cifrado de datos, el uso de conexiones seguras, " +
                "y el cumplimiento de leyes y regulaciones como el GDPR. Siempre es importante limitar la cantidad de datos que se recolectan " +
                "y almacenan, y asegurarse de que los usuarios estén informados sobre cómo se utilizan sus datos.");

        // Configurar el listener para el botón de retroceso
        backButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Crear un Intent para volver a MainActivity
                Intent intent = new Intent(DataProtectionActivity.this, MainActivity.class);
                startActivity(intent);
                finish(); // Finalizar la actividad actual para que no quede en el historial de actividades
            }
        });
    }
}