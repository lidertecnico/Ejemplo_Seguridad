package aplicacionesmoviles.avanzado.todosalau.ejemploseguridad;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import com.bumptech.glide.Glide;

public class LoginSuccessActivity extends AppCompatActivity {

    private Button backToMainButton; // Botón para volver a la actividad principal

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_success);

        // Inicializar la vista de la imagen GIF y cargar el GIF usando Glide
        ImageView gifImageView = findViewById(R.id.gif_image_view);
        Glide.with(this).load(R.drawable.success_gif).into(gifImageView);

        // Inicializar el botón de retroceso
        backToMainButton = findViewById(R.id.back_to_main_button);

        // Configurar el listener para el botón de retroceso
        backToMainButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Crear un Intent para regresar a MainActivity
                Intent intent = new Intent(LoginSuccessActivity.this, MainActivity.class);
                startActivity(intent);
            }
        });
    }
}