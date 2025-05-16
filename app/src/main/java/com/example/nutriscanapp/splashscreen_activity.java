package com.example.nutriscanapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class splashscreen_activity extends AppCompatActivity {

    Button btnMulai;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.SplashScreenActivity);

        btnMulai = findViewById(R.id.btnMulai);

        btnMulai.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Pindah ke LoginActivity
                Intent intent = new Intent(splashscreen_activity.this, login_activity.class);
                startActivity(intent);
                finish(); // supaya tidak bisa balik ke splash
            }
        });
    }
}
