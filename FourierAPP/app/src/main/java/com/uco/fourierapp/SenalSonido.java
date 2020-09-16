package com.uco.fourierapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.Toast;

public class SenalSonido extends AppCompatActivity {

    private Button btndescartarSenalSonido, btngurdarSenalSonido;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_senal_sonido);

        btndescartarSenalSonido = (Button) findViewById(R.id.descartarSenalSonido);
        btngurdarSenalSonido = (Button) findViewById(R.id.gurdarSenalSonido);

        btngurdarSenalSonido.setOnClickListener(view -> {
            Toast.makeText(getApplicationContext(), R.string.guardadoExitoso, Toast.LENGTH_LONG).show();
            startActivity(new Intent(SenalSonido.this, MainActivity.class));
        });

        btndescartarSenalSonido.setOnClickListener(view -> {
            Toast.makeText(getApplicationContext(), R.string.descarte, Toast.LENGTH_LONG).show();
            startActivity(new Intent(SenalSonido.this, MainActivity.class));
        });
    }
}