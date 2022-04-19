package com.example.techloungesecurity;

import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    int count=0;
    Button b1,b2;
    TextView a,b;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        a=findViewById(R.id.tv);
        b1=findViewById(R.id.bt1);
        b2=findViewById(R.id.bt2);
        b=findViewById(R.id.tv2);

        b1.setOnClickListener(this);
        b2.setOnClickListener(this);

    }

    @Override
    public void onClick(View view) {

        if(view == b1)
        {
            count=(count+1)%10;
            b.setText(Integer.toString(count));
        }
        if(view == b2)
        {
            if(count-1 == -1)
                Toast.makeText(getApplicationContext(),"MINIMUM 1 PERSON",Toast.LENGTH_SHORT).show();
            else
            {
                count=count-1;
                b.setText(Integer.toString(count));
            }
        }
    }
}