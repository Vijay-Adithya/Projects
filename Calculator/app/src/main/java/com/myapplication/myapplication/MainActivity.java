package com.myapplication.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;



public class MainActivity extends AppCompatActivity {

    EditText n1,n2,n3;
    Button b1,b2,b3,b4;
    int a,b,res;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        n1 = (EditText) findViewById(R.id.fno);
        n2 = (EditText) findViewById(R.id.sno);
        n3 = (EditText) findViewById(R.id.res);

        b1 = (Button) findViewById(R.id.add);
        b2 = (Button) findViewById(R.id.sub);
        b3 = (Button) findViewById(R.id.mul);
        b4 = (Button) findViewById(R.id.div);

        b1.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                if(!n1.getText().toString().isEmpty()){
                    a = Integer.parseInt(n1.getText().toString());
                }
                if(!n2.getText().toString().isEmpty()){
                    b = Integer.parseInt(n2.getText().toString());
                }
                res = a+b;
                n3.setText(Integer.toString(res));

            }
        });

        b2.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                if(!n1.getText().toString().isEmpty()){
                    a = Integer.parseInt(n1.getText().toString());
                }
                if(!n2.getText().toString().isEmpty()){
                    b = Integer.parseInt(n2.getText().toString());
                }
                res = a-b;
                n3.setText(Integer.toString(res));

            }
        });

        b3.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                if(!n1.getText().toString().isEmpty()){
                    a = Integer.parseInt(n1.getText().toString());
                }
                if(!n2.getText().toString().isEmpty()){
                    b = Integer.parseInt(n2.getText().toString());
                }
                res = a*b;
                n3.setText(Integer.toString(res));

            }
        });

        b4.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                if(!n1.getText().toString().isEmpty()){
                    a = Integer.parseInt(n1.getText().toString());
                }
                if(!n2.getText().toString().isEmpty()){
                    b = Integer.parseInt(n2.getText().toString());
                }
                res = a/b;
                n3.setText(Integer.toString(res));

            }
        });

    }
}