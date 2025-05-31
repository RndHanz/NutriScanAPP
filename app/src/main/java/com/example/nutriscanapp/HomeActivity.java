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
            // TODO: Tambahkan logika untuk membuka activity Chat AI di sini
            // Contoh: startActivity(new Intent(HomeActivity.this, ChatAIActivity.class));
            // Toast.makeText(HomeActivity.this, "Membuka Chat AI", Toast.LENGTH_SHORT).show();
        });

        btnScan.setOnClickListener(v -> {
            // TODO: Tambahkan logika untuk membuka activity Scanner di sini
            // Contoh: startActivity(new Intent(HomeActivity.this, ScannerActivity.class));
            // Toast.makeText(HomeActivity.this, "Membuka Scanner", Toast.LENGTH_SHORT).show();
        });

        btnLogout.setOnClickListener(v -> {
            // TODO: Tambahkan logika untuk proses logout di sini
            // Misalnya, menghapus sesi pengguna, mengarahkan kembali ke halaman login
            // Contoh: FirebaseAuth.getInstance().signOut(); // Jika menggunakan Firebase Auth
            // Contoh: Intent intent = new Intent(HomeActivity.this, LoginActivity.class);
            // Contoh: intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP | Intent.FLAG_ACTIVITY_NEW_TASK);
            // Contoh: startActivity(intent);
            // Contoh: finish(); // Menutup HomeActivity agar tidak bisa kembali dengan tombol back
            // Toast.makeText(HomeActivity.this, "Anda Telah Logout", Toast.LENGTH_SHORT).show();
        });

        // Menambahkan OnClickListener untuk tombol navigasi bawah
        layoutProfile.setOnClickListener(v -> {
            // TODO: Tambahkan logika untuk membuka halaman Profile di sini
            // Contoh: startActivity(new Intent(HomeActivity.this, ProfileActivity.class));
            // Toast.makeText(HomeActivity.this, "Membuka Profil", Toast.LENGTH_SHORT).show();
        });

        layoutBottomScan.setOnClickListener(v -> {
            // TODO: Tambahkan logika untuk membuka Scanner dari navigasi bawah di sini
            // Ini bisa diarahkan ke Activity Scanner yang sama dengan tombol scan di atas, atau yang berbeda
            // Contoh: startActivity(new Intent(HomeActivity.this, ScannerActivity.class));
            // Toast.makeText(HomeActivity.this, "Membuka Scanner (Navigasi Bawah)", Toast.LENGTH_SHORT).show();
        });

        layoutHistory.setOnClickListener(v -> {
            // TODO: Tambahkan logika untuk membuka halaman Riwayat di sini
            // Contoh: startActivity(new Intent(HomeActivity.this, HistoryActivity.class));
            // Toast.makeText(HomeActivity.this, "Membuka Riwayat", Toast.LENGTH_SHORT).show();
        });
    }
}