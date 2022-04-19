package com.example.devang.validate;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText uname,pwd;
    Button valid;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Context context = getApplicationContext();
        uname = (EditText) findViewById(R.id.username);
        pwd = (EditText) findViewById(R.id.password);
        valid = (Button) findViewById(R.id.validateButton);

        valid.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(uname.getText().toString().matches("[a-zA-Z]+")&&(pwd.getText().toString().matches("[0-9]+"))&&(pwd.length()==4)){
                    Toast.makeText(context,"Validation Sucessfull",Toast.LENGTH_LONG).show();
                }
                else if (!(uname.getText().toString().matches("[a-zA-Z]+")))
                {
                    Toast.makeText(context,"User Id Accepts Only Alphabets",Toast.LENGTH_LONG).show();
                    if(uname.getText().toString().isEmpty()){
                        Toast.makeText(context,"User Id should not be empty",Toast.LENGTH_LONG).show();
                    }
                }
                else if (!(pwd.getText().toString().matches("[0-9]+")))
                {
                    Toast.makeText(context,"Password Accepts Only Numerical Values",Toast.LENGTH_LONG).show();
                    if(pwd.getText().toString().isEmpty()){
                        Toast.makeText(context,"Password should not be empty",Toast.LENGTH_LONG).show();
                    }
                }
                else if (!(pwd.length()==4))
                {
                    Toast.makeText(context,"Password Length Should Be Only 4 Numbers",Toast.LENGTH_LONG).show();
                }

            }
        });

    }
}
