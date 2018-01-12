package com.example.osamabutt.projectprototype;

import android.app.Activity;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

/**
 * Created by Osama Butt on 01/06/2018.
 */

public class login extends AppCompatActivity {

    EditText password;
    EditText phoneEmail;
    Button submit;
    String phoneE;
    String pass;
    Button forgotPassword;

    @Override
    protected void onCreate(@Nullable final Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.login);


        phoneEmail=(EditText)findViewById(R.id.phoneEmail);
        password=(EditText)findViewById(R.id.pass);
        submit=(Button)findViewById(R.id.login);
        forgotPassword=(Button)findViewById(R.id.forgotPassword);

        forgotPassword.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent i=new Intent(login.this,signup.class);
                startActivity(i);

            }
        });

        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                phoneE=phoneEmail.getText().toString();
                pass=password.getText().toString();


                ProductCollectionFragment fragment = new ProductCollectionFragment();
                FragmentManager fragmentManager = getFragmentManager();
                FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
                fragmentTransaction.add(R.id.main_recyclerview_place_holder,fragment);
                fragmentTransaction.commit();


                Toast toast = Toast.makeText(getApplicationContext(), "LogIn Successfull", Toast.LENGTH_SHORT);
                toast.show();
            }
        });







    }
}
