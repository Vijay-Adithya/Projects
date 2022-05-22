package com.example.messageapp;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityCompat;
import androidx.core.content.ContextCompat;

import android.Manifest;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.telephony.SmsManager;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
     EditText mno,message;
     Button send;
     String mobno,mess;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mno = findViewById(R.id.mno);
        message = findViewById(R.id.msg);
        send = findViewById(R.id.send);
        String mobno = mno.getText().toString();
        String mess = message.getText().toString();
        send.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String mobno = mno.getText().toString();
                String mess = message.getText().toString();
                sendSMS(mobno,mess);
            }
        });
    }
    public void sendSMS(String userNumber,String userMessage)
    {
        if(ContextCompat.checkSelfPermission(this, Manifest.permission.SEND_SMS)!= PackageManager.PERMISSION_GRANTED){
            ActivityCompat.requestPermissions(this, new String[]{Manifest.permission.SEND_SMS},1);
        }
        else
        {
            SmsManager smsManager = SmsManager.getDefault();
            smsManager.sendTextMessage(userNumber,null,userMessage,null,null);
        }
    }
    public void onRequestPermissionsResult(int requestCode, @NonNull String[] permissions,@NonNull int[] grantResults){
        super.onRequestPermissionsResult(requestCode,permissions,grantResults);
        if (requestCode == 1 && grantResults.length > 0 && grantResults[0] == PackageManager.PERMISSION_GRANTED) {
            SmsManager smsManager = SmsManager.getDefault();
            smsManager.sendTextMessage(mobno,null,mess,null,null);
        }
    }

}