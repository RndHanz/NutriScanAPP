package com.example.nutriscanapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
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
            String nama = namaField.getText().toString();
            String password = passwordField.getText().toString();

            // TODO: Validasi login
        });

        txtToSignUp.setOnClickListener(v -> {
            Intent intent = new Intent(LoginActivity.this, SignUpActivity.class);
            startActivity(intent);
        });
    }
}
