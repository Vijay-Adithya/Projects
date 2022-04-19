package com.example.scical;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import java.lang.Math;


public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    Button add,sub,mul,div,sin,cos,tan,sqrt,mod,eq;
    EditText a,b,result;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        add=findViewById(R.id.bt1);
        sub=findViewById(R.id.bt2);
        mul=findViewById(R.id.bt3);
        div=findViewById(R.id.bt4);
        sin=findViewById(R.id.bt5);
        cos=findViewById(R.id.bt6);
        tan=findViewById(R.id.bt7);
        sqrt=findViewById(R.id.bt8);
        mod=findViewById(R.id.bt9);
        //eq=findViewById(R.id.bt10);

        a= findViewById(R.id.et1);
        b= findViewById(R.id.et2);
        result= findViewById(R.id.et3);

        add.setOnClickListener(this);
        sub.setOnClickListener(this);
        mul.setOnClickListener(this);
        div.setOnClickListener(this);
        sin.setOnClickListener(this);
        cos.setOnClickListener(this);
        tan.setOnClickListener(this);
        sqrt.setOnClickListener(this);
        mod.setOnClickListener(this);
        //eq.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {

        double n1=Double.parseDouble(a.getText().toString());
        double n2=Double.parseDouble(b.getText().toString());
        double res=0;


        if(view == add) {
            res=n1+n2;
            result.setText(Double.toString(res));
        }
        if(view == sub){
            res=n1-n2;
            result.setText(Double.toString(res));
        }
        if(view == mul){
            res=n1*n2;
            result.setText(Double.toString(res));
        }
        if(view == div){
            res=n1/n2;
            result.setText(Double.toString(res));
        }
        if(view == sin){
            res= Math.sin(n1);
            result.setText(Double.toString(res));
        }if(view == cos){
            res= Math.cos(n1);
            result.setText(Double.toString(res));
        }if(view == tan){
            res= Math.tan(n1);
            result.setText(Double.toString(res));
        }if(view == sqrt){
            res= Math.sqrt(n1);
            result.setText(Double.toString(res));
        }if(view == mod){
            res= n1 % n2;
            result.setText(Double.toString(res));
         }
//        if(view == eq){
//            res= n1 ;
//            result.setText(Double.toString(res));
//        }
    }
}