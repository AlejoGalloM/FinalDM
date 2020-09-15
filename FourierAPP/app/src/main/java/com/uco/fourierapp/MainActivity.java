package com.uco.fourierapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private Button btnInsertarSenal, btnVerSenalesGuardadas;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnInsertarSenal = (Button) findViewById(R.id.insertar);
        btnVerSenalesGuardadas = (Button) findViewById(R.id.ver);

        btnInsertarSenal.setOnClickListener(view ->
                startActivity(new Intent(MainActivity.this, InsertarSenal.class)));
        btnVerSenalesGuardadas.setOnClickListener(view ->
                startActivity(new Intent(MainActivity.this, SenalGuardadas.class)));
    }
}