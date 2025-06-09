package com.example.nutriscanapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.Button;
import android.widget.TextView;
import android.widget.LinearLayout; // Penting: Import LinearLayout

import androidx.appcompat.app.AppCompatActivity;

public class HomeActivity extends AppCompatActivity {

    TextView txtGreeting;
    Button btnLogout;
    ImageView btnChatAI, btnScan;
    // Mengubah ImageView menjadi LinearLayout untuk navigasi bawah agar bisa menampung ikon dan teks
    LinearLayout layoutProfile, layoutBottomScan, layoutHistory;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.home_activity);

        // Inisialisasi komponen UI dari layout home_activity.xml
        txtGreeting = findViewById(R.id.txtGreeting);
        btnLogout = findViewById(R.id.btnLogout);
        btnChatAI = findViewById(R.id.btnChatAI);
        btnScan = findViewById(R.id.btnScan);

        // Inisialisasi LinearLayout untuk navigasi bawah
        layoutProfile = findViewById(R.id.layoutProfile);
        layoutBottomScan = findViewById(R.id.layoutBottomScan);
        layoutHistory = findViewById(R.id.layoutHistory);

        // Mengatur teks salam berdasarkan username yang diteruskan melalui Intent
        String username = getIntent().getStringExtra("username");
        if (username != null && username.equalsIgnoreCase("admin")) {
            txtGreeting.setText("Halo, Admin Selamat Datang");
        } else if (username != null) {
            txtGreeting.setText("Halo, " + username + " Selamat Datang");
        }


        // Menambahkan OnClickListener untuk tombol utama di bagian tengah layout
        btnChatAI.setOnClickListener(v -> {
            Intent intent = new Intent(HomeActivity.this, ChatAiActivity.class);
            startActivity(intent);
        });

        btnScan.setOnClickListener(v -> {
            Intent intent = new Intent(HomeActivity.this, ScanActivity.class);
            startActivity(intent);
        });


        btnLogout.setOnClickListener(v -> {
            Intent intent = new Intent(HomeActivity.this, LoginActivity.class);
            startActivity(intent);
        });

        // Menambahkan OnClickListener untuk tombol navigasi bawah
        layoutProfile.setOnClickListener(v -> {
            Intent intent = new Intent(HomeActivity.this, ProfileActivity.class);
            startActivity(intent);

        });

        layoutBottomScan.setOnClickListener(v -> {
            Intent intent = new Intent(HomeActivity.this, ScanActivity.class);
            startActivity(intent);
        });


        layoutHistory.setOnClickListener(v -> {
            // TODO: Tambahkan logika untuk membuka halaman Riwayat di sini
            // Contoh: startActivity(new Intent(HomeActivity.this, HistoryActivity.class));
            // Toast.makeText(HomeActivity.this, "Membuka Riwayat", Toast.LENGTH_SHORT).show();
        });
    }
}