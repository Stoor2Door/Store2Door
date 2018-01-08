package com.example.osamabutt.projectprototype;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.widget.Toast;

/**
 * Created by Osama Butt on 05/14/2017.
 */

public class mainscreen extends AppCompatActivity{

    private int splasgTime=1500;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);


        setContentView(R.layout.mainpage);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent i=new Intent(mainscreen.this,MainActivity.class);
                startActivity(i);

                finish();
            }
        },splasgTime);

    }
}
