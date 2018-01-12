package com.example.osamabutt.projectprototype;

import android.content.Intent;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import static android.R.attr.start;

public class MainActivity extends AppCompatActivity {
 //DrawerLayout mDrawerlayout;
 private ActionBarDrawerToggle mToggle;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
   DrawerLayout     mDrawerlayout = (DrawerLayout)findViewById(R.id.drawer);
        mToggle = new ActionBarDrawerToggle(this,mDrawerlayout,R.string.open,R.string.close);
        mToggle.syncState();
       // getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        Button l=(Button)findViewById(R.id.log);
        Button s=(Button)findViewById(R.id.signup);

        l.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(MainActivity.this,login.class);
                startActivity(i);
            }
        });

        s.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(MainActivity.this,signup.class);
                startActivity(i);
            }
        });

    }
   /* @Override
    public boolean onOptionsItemSelected(MenuItem item)
    {
        if(mToggle.onOptionsItemSelected(item))
        {
            return true;
        }
        return super.onOptionsItemSelected(item);

    }*/
}
