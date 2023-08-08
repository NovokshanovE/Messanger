package com.enovoksh.multiactivity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button button = findViewById(R.id.buttonSendMessege);
        EditText editMessageText = findViewById(R.id.editMessege);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String text = editMessageText.getText().toString();
                launchNextScreen(text);
            }
        });
    }

    private void launchNextScreen(String message){
        Intent intent = new Intent(this, ReceivedMessageActivity.class);
        intent.putExtra("message", message);
        startActivity(intent);
    }
}