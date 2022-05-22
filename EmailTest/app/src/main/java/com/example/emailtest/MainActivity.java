package com.example.emailtest;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    EditText message,subject,email;
    Button send;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        message = findViewById(R.id.message);
        subject = findViewById(R.id.subject);
        email = findViewById(R.id.email);
        send = findViewById(R.id.send);
        send.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String userEmail = email.getText().toString();
                String userMessage = message.getText().toString();
                String userSubject = subject.getText().toString();
                Intent emailIntent = new Intent(Intent.ACTION_SEND);
                emailIntent.setData(Uri.parse("mailto"));
                emailIntent.setType("text/plain");
                String []mailaddress = {userEmail};
                emailIntent.putExtra(Intent.EXTRA_EMAIL,mailaddress);
                emailIntent.putExtra(Intent.EXTRA_SUBJECT,userSubject);
                emailIntent.putExtra(Intent.EXTRA_TEXT,userMessage);
                startActivity(Intent.createChooser(emailIntent,"Send Email"));
            }
        });
    }
}