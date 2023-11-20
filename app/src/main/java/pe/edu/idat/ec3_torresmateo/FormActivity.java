package pe.edu.idat.ec3_torresmateo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import pe.edu.idat.ec3_torresmateo.databinding.ActivityFormBinding;

public class FormActivity extends AppCompatActivity {

    private ActivityFormBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_form);
    }
}