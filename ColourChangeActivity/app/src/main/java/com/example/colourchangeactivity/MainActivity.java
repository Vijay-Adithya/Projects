package com.example.colourchangeactivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity implements View.OnClickListener  {

    TextView a;
    LinearLayout li;
    Button b1,b2,b3;

    int[] color_list = {Color.RED ,Color.GREEN ,Color.BLUE};
    int text_index =0;
    int back_index=0;
    int text_size = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        a = findViewById(R.id.tv1);
        b1= findViewById(R.id.bt1);
        b2= findViewById(R.id.bt2);
        b3= findViewById(R.id.bt3);
        li= findViewById(R.id.bg);


        b1.setOnClickListener(this);
        b2.setOnClickListener(this);
        b3.setOnClickListener(this);


    }
    public void onClick(View view) {

        if(view == b1)
        {
            a.setTextSize(text_size + 5);
            if(text_size == 50)
                text_size = 0;
            else
                text_size = text_size +5;
        }

        if(view == b2){

            a.setTextColor(color_list[text_index]);
            if(text_index == 2)
                text_index =0;
            else
                text_index++;
        }

        if(view == b3)
        {
            li.setBackgroundColor(color_list[back_index]);
            if(back_index == 2)
                back_index =0;
            else
                back_index++;
        }

    }
}