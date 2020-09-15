package com.uco.fourierapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

public class InsertarSenal extends AppCompatActivity {

    private Button btnSenalSonido, btnSenalMovimiento;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_insertar_senal);

        btnSenalSonido = (Button) findViewById(R.id.senalSonido);
        btnSenalMovimiento = (Button) findViewById(R.id.senalMovimiento);

        btnSenalSonido.setOnClickListener(view ->
                startActivity(new Intent(InsertarSenal.this, SenalSonido.class)));
        btnSenalMovimiento.setOnClickListener(view ->
                startActivity(new Intent(InsertarSenal.this, SenalMov.class)));
    }
}