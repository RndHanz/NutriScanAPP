package com.example.nutriscanapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class SignUpActivity extends AppCompatActivity {

    Spinner spinnerAlergi;
    TextView txtToLogin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.signup_activity);

        // Inisialisasi Spinner Alergi
        spinnerAlergi = findViewById(R.id.spinnerAlergi);

        String[] daftarAlergi = {
                "Pilih Alergi                                                              >",
                "Kacang",
                "Susu",
                "Telur",
                "Seafood",
                "Gandum",
                "Lainnya"
        };

        ArrayAdapter<String> adapter = new ArrayAdapter<>(
                this,
                android.R.layout.simple_spinner_dropdown_item,
                daftarAlergi
        );
        spinnerAlergi.setAdapter(adapter);

        // Inisialisasi dan event klik "Sudah punya akun? Login"
        txtToLogin = findViewById(R.id.txtToLogin);
        txtToLogin.setOnClickListener(v -> {
            Intent intent = new Intent(SignUpActivity.this, LoginActivity.class);
            startActivity(intent);
            finish(); // agar tidak kembali ke SignUp saat menekan tombol back
        });
    }
}
