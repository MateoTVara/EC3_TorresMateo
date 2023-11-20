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

        binding.button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String usuario = binding.etusuario.getText().toString();
                String contrasenia = binding.etcontrasenia.getText().toString();

                if (validarCredenciales(usuario, contrasenia)) {
                    Intent intent = new Intent(LoginActivity.this, FormActivity.class);
                    startActivity(intent);
                } else {
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