package com.example.osamabutt.projectprototype;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

/**
 * Created by Osama Butt on 01/06/2018.
 */

public class signup  extends AppCompatActivity{

    EditText name;
    EditText email;
    EditText pass;
    EditText cpass;
    EditText phone;

    String n;
    String e;
    String p;
    String cp;
    String ph;

    Button b;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.signup);

        name=(EditText)findViewById(R.id.editText2);
        email=(EditText)findViewById(R.id.editText);
        pass=(EditText)findViewById(R.id.password);
        cpass=(EditText)findViewById(R.id.confirmPassword);
        phone=(EditText)findViewById(R.id.phone);

        b=(Button)findViewById(R.id.signUp);

        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                n=name.getText().toString();
                e=email.getText().toString();
                p=pass.getText().toString();
                cp=cpass.getText().toString();
                ph=phone.getText().toString();

                Toast t=Toast.makeText(getApplicationContext(),"SignUp Sucessfull", Toast.LENGTH_SHORT);
                t.show();

            }
        });

    }
}
