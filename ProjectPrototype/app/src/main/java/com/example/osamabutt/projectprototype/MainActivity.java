package com.example.osamabutt.projectprototype;

import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.design.widget.NavigationView;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity
{
    public static String[] data;
    public static int[] path;
 //DrawerLayout mDrawerlayout;
 private ActionBarDrawerToggle mToggle;
 private   NavigationView navigationView;
 private FragmentTransaction fragmentTransaction;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
   final DrawerLayout     mDrawerlayout = (DrawerLayout)findViewById(R.id.drawer);
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





         navigationView = (NavigationView) findViewById(R.id.navigationView);
         navigationView.setNavigationItemSelectedListener(new NavigationView.OnNavigationItemSelectedListener()
        {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item)
            {
                switch(item.getItemId())
                {
                    case R.id.vegetable:
                        data = VegetableData.vegetables;
                        path = VegetableData.path;
                        ProductCollectionFragment fragment = new ProductCollectionFragment();
                        FragmentManager fragmentManager = getFragmentManager();
                        fragmentTransaction = fragmentManager.beginTransaction();
                        fragmentTransaction.replace(R.id.main_recyclerview_place_holder,fragment);
                        fragmentTransaction.commit();
                        item.setChecked(true);
                        mDrawerlayout.closeDrawers();
                        break;

                        case R.id.fruits:
                        data = FruitData.fruits;
                        path = FruitData.path;
                            fragment = new ProductCollectionFragment();
                            fragmentManager = getFragmentManager();
                        fragmentTransaction = fragmentManager.beginTransaction();
                        fragmentTransaction.replace(R.id.main_recyclerview_place_holder,fragment);
                        fragmentTransaction.commit();
                            item.setChecked(true);
                            mDrawerlayout.closeDrawers();
                            break;



                        case R.id.bakery:
                        data = VegetableData.vegetables;
                        path = VegetableData.path;
                            fragment = new ProductCollectionFragment();
                            fragmentManager = getFragmentManager();
                        fragmentTransaction = fragmentManager.beginTransaction();
                        fragmentTransaction.replace(R.id.main_recyclerview_place_holder,fragment);
                        fragmentTransaction.commit();
                            item.setChecked(true);
                            mDrawerlayout.closeDrawers();
                            break;


                }
                return false;
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
