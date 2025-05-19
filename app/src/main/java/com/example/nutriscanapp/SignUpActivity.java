package com.example.nutriscanapp;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

import androidx.appcompat.app.AppCompatActivity;

public class SignUpActivity extends AppCompatActivity {

    Spinner spinnerAlergi;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.signup_activity); // GANTI dengan file layout signup kamu

        // Temukan Spinner di layout
        spinnerAlergi = findViewById(R.id.spinnerAlergi);

        // Daftar alergi yang ditampilkan pada dropdown
        String[] daftarAlergi = {
                "Pilih Alergi",
                "Kacang",
                "Susu",
                "Telur",
                "Seafood",
                "Gandum",
                "Lainnya"
        };

        // Adapter untuk Spinner
        ArrayAdapter<String> adapter = new ArrayAdapter<>(
                this,
                android.R.layout.simple_spinner_dropdown_item,
                daftarAlergi
        );

        spinnerAlergi.setAdapter(adapter);
    }
}
