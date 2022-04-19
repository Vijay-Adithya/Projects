package com.example.filereadwrite;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.nio.charset.StandardCharsets;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    Button read,write;
    EditText fileName , stuName , cgpa;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        read = findViewById(R.id.bt1);
        write =findViewById(R.id.bt2);

        fileName = findViewById(R.id.et1);
        stuName = findViewById(R.id.et2);
        cgpa = findViewById(R.id.et3);

        read.setOnClickListener(this);
        write.setOnClickListener(this);

    }

    @Override
    public void onClick(View view) {

        if(view == read){
            try {
                int c = 0;
                String temp = "";
                FileInputStream fi = openFileInput(fileName.getText().toString());
                while( (c = fi.read())!= -1 ){
                    temp = temp + Character.toString((char)c);
                }
                fi.close();
                String a[];
                a = temp.split(",");
                stuName.setText(a[0]);
                cgpa.setText(a[1]);


            }

            catch (Exception e){
                e.printStackTrace();
            }
        }

        if(view == write)
        {
            try{
                String data = " ";
                FileOutputStream fo = openFileOutput(fileName.getText().toString() , MODE_PRIVATE);
                data = stuName.getText().toString()+ "," + cgpa.getText().toString();
                fo.write(data.getBytes());
                fo.close();
            }
            catch (Exception e){

            }
        }
    }
}