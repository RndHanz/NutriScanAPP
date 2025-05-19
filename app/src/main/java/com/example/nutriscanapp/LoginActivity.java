package com.example.nutriscanapp;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

import androidx.appcompat.app.AppCompatActivity;

public class LoginActivity extends AppCompatActivity {

    Spinner spinnerAlergi;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login_activity);

        // Temukan Spinner di layout
        spinnerAlergi = findViewById(R.id.spinnerAlergi);

        // Buat daftar item untuk dropdown
        String[] daftarAlergi = {
                "Pilih Alergi",
                "Kacang",
                "Susu",
                "Telur",
                "Seafood",
                "Gandum",
                "Lainnya"
        };

        // Buat adapter untuk menghubungkan array dengan spinner
        ArrayAdapter<String> adapter = new ArrayAdapter<>(
                this,
                android.R.layout.simple_spinner_dropdown_item,
                daftarAlergi
        );

        // Set adapter-nya ke Spinner
        spinnerAlergi.setAdapter(adapter);
    }
}
