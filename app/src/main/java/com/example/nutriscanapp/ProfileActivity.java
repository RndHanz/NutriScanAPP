package com.example.nutriscanapp;

import android.os.Bundle;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class ProfileActivity extends AppCompatActivity {

    EditText etUsia, etAlergi, etTinggi, etBerat;
    LinearLayout btnLogout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.profile_activity);

        etUsia = findViewById(R.id.etUsia);
        etAlergi = findViewById(R.id.etAlergi);
        etTinggi = findViewById(R.id.etTinggi);
        etBerat = findViewById(R.id.etBerat);
        btnLogout = findViewById(R.id.btnLogout);

        btnLogout.setOnClickListener(v -> {
            // TODO: Tambahkan logika logout
            finish();
        });
    }
}
