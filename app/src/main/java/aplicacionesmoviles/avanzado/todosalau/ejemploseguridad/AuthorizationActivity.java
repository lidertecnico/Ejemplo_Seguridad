package aplicacionesmoviles.avanzado.todosalau.ejemploseguridad;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.TextView;

public class AuthorizationActivity extends AppCompatActivity {

    private Spinner roleSpinner; // Selector de roles
    private Button applyRoleButton; // Botón para aplicar el rol seleccionado
    private Button backToMainButton; // Botón para volver a la actividad principal
    private TextView accessResourcesTextView; // TextView para mostrar los recursos accesibles

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_authorization);

        // Inicializar los elementos de la interfaz de usuario
        roleSpinner = findViewById(R.id.role_spinner);
        applyRoleButton = findViewById(R.id.apply_role_button);
        backToMainButton = findViewById(R.id.back_to_main_button);
        accessResourcesTextView = findViewById(R.id.access_resources);

        // Configurar el listener para el botón de aplicar rol
        applyRoleButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Obtener el rol seleccionado del spinner
                String selectedRole = roleSpinner.getSelectedItem().toString();
                // Obtener los recursos accesibles para el rol seleccionado
                String accessibleResources = getAccessibleResources(selectedRole);
                // Mostrar los recursos accesibles en el TextView
                accessResourcesTextView.setText(accessibleResources);
            }
        });

        // Configurar el listener para el botón de volver a la actividad principal
        backToMainButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Intent para regresar al MainActivity
                Intent intent = new Intent(AuthorizationActivity.this, MainActivity.class);
                startActivity(intent);
            }
        });
    }

    // Método para obtener los recursos accesibles para un rol dado
    private String getAccessibleResources(String role) {
        // Determinar los recursos accesibles según el rol
        switch (role) {
            case "Administrador":
                return "Recursos accesibles:\n- Gestión de Usuarios\n- Configuración del Sistema\n- Reportes Avanzados";
            case "Usuario":
                return "Recursos accesibles:\n- Ver Perfil\n- Editar Perfil\n- Reportes Básicos";
            case "Invitado":
                return "Recursos accesibles:\n- Ver Perfil\n- Ayuda y Soporte";
            default:
                return "No hay recursos accesibles para este rol.";
        }
    }
}