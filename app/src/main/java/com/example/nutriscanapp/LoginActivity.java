package com.example.nutriscanapp;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;

public class LoginActivity extends AppCompatActivity {

    EditText namaField, passwordField;
    Button btnLogin;
    TextView txtToSignUp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login_activity);

        namaField = findViewById(R.id.namaField);
        passwordField = findViewById(R.id.passwordField);
        btnLogin = findViewById(R.id.btnLogin);
        txtToSignUp = findViewById(R.id.txtToSignUp);

        btnLogin.setOnClickListener(v -> {
            String nama = namaField.getText().toString().trim();
            String password = passwordField.getText().toString().trim();

            if (nama.isEmpty()) {
                Toast.makeText(LoginActivity.this, "Username wajib diisi", Toast.LENGTH_SHORT).show();
                return;
            }

            if (password.isEmpty()) {
                Toast.makeText(LoginActivity.this, "Password wajib diisi", Toast.LENGTH_SHORT).show();
                return;
            }

            // Jika lolos validasi, lanjut ke HomeActivity
            Intent intent = new Intent(LoginActivity.this, HomeActivity.class);
            intent.putExtra("username", nama);
            startActivity(intent);
            finish(); // Supaya tidak bisa kembali ke login
        });

        txtToSignUp.setOnClickListener(v -> {
            Intent intent = new Intent(LoginActivity.this, SignUpActivity.class);
            startActivity(intent);
        });
    }
}
