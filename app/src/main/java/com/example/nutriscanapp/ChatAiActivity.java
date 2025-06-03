package com.example.nutriscanapp;

import android.os.Bundle;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class ChatAiActivity extends AppCompatActivity {

    private EditText messageInput;
    private ImageButton sendButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.chatai_activity);

        messageInput = findViewById(R.id.messageInput);
        sendButton = findViewById(R.id.sendButton);

        sendButton.setOnClickListener(v -> {
            String message = messageInput.getText().toString().trim();
            if (!message.isEmpty()) {
                // Di sini kamu bisa kirim ke API AI-mu
                Toast.makeText(this, "Mengirim: " + message, Toast.LENGTH_SHORT).show();
                messageInput.setText("");
            }
        });
    }
}
