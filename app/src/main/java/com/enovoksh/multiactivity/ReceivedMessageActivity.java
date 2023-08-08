package com.enovoksh.multiactivity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class ReceivedMessageActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_received_message);
        Intent intent = getIntent();
        String message = intent.getStringExtra("message");
        TextView messageTextView = findViewById(R.id.message_text);
        messageTextView.setText(message);
    }
}