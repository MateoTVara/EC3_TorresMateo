package pe.edu.idat.ec3_torresmateo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import pe.edu.idat.ec3_torresmateo.databinding.ActivityLoginBinding;

public class LoginActivity extends AppCompatActivity {

    private ActivityLoginBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityLoginBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        // Configurar acciones
        binding.button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Obtener credenciales ingresadas
                String usuario = binding.etusuario.getText().toString();
                String contrasenia = binding.etcontrasenia.getText().toString();

                // Verificar las credenciales
                if (validarCredenciales(usuario, contrasenia)) {
                    // Credenciales válidas, iniciar la actividad FormActivity
                    Intent intent = new Intent(LoginActivity.this, FormActivity.class);
                    startActivity(intent);
                } else {
                    // Credenciales inválidas, mostrar un mensaje de error
                    binding.etusuario.setError("Credenciales incorrectas");
                    binding.etcontrasenia.setError("Credenciales incorrectas");
                }
            }
        });
    }

    private boolean validarCredenciales(String usuario, String contrasenia) {
        return usuario.equals("Mateo") && contrasenia.equals("SYS123");
    }
}