package com.example.nutriscanapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class HomeActivity extends AppCompatActivity {

    TextView txtGreeting;
    Button btnLogout;
    ImageView btnChatAI, btnScan, btnProfile, btnBottomScan, btnHistory;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.home_activity);

        txtGreeting = findViewById(R.id.txtGreeting);
        btnLogout = findViewById(R.id.btnLogout);
        btnChatAI = findViewById(R.id.btnChatAI);
        btnScan = findViewById(R.id.btnScan);
        btnProfile = findViewById(R.id.btnProfile);
        btnBottomScan = findViewById(R.id.btnBottomScan);
        btnHistory = findViewById(R.id.btnHistory);

        // Ganti nama user sesuai intent atau default
        String username = getIntent().getStringExtra("username");
        if (username != null && username.equalsIgnoreCase("admin")) {
            txtGreeting.setText("Halo, Admin Selamat Datang");
        } else if (username != null) {
            txtGreeting.setText("Halo, " + username + " Selamat Datang");
        }

        // Event listener (placeholder)
        btnChatAI.setOnClickListener(v -> {
            // TODO: Buka activity chat AI
        });

        btnScan.setOnClickListener(v -> {
            // TODO: Buka activity scanner
        });

        btnLogout.setOnClickListener(v -> {
            // TODO: Buat aksi logout nanti
        });

        btnProfile.setOnClickListener(v -> {
            // TODO: Buka halaman profile
        });

        btnBottomScan.setOnClickListener(v -> {
            // TODO: Buka scanner
        });

        btnHistory.setOnClickListener(v -> {
            // TODO: Buka riwayat
        });
    }
}
