package com.example.osamabutt.projectprototype;

import android.annotation.SuppressLint;
import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.StaggeredGridLayoutManager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import static com.example.osamabutt.projectprototype.MainActivity.data;
import static com.example.osamabutt.projectprototype.MainActivity.path;

/**
 * Created by syed_ on 1/13/2018.
 */


public class ProductCollectionFragment extends Fragment
{
    //if we want to use staggered layout then following variable will be uncommented
    //private StaggeredGridLayoutManager gaggeredGridLayoutManager;
    private GridLayoutManager gridLayoutManager;



    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.productcollection,container,false);
        RecyclerView recyclerView = (RecyclerView) view.findViewById(R.id.productcollection);
        recyclerView.setHasFixedSize(true);

        //no of colums in each row
        int numberOfColumns = 2;



        //if we want to use staggered layout instead of grid layout

        // gaggeredGridLayoutManager = new StaggeredGridLayoutManager(1, 1);
        //gridLayoutManager = new GridLayoutManager(this,);
        // recyclerView.setLayoutManager(gaggeredGridLayoutManager);
        // String[] vegetables = {"caulif","carrot","brinjal","tomatoes","ginger","garlic","potato","onion"};
        //int[] path = {R.drawable.cauliflower,R.drawable.picture_2,R.drawable.picture_3,R.drawable.picture_4,R.drawable.picture_5,R.drawable.picture_6,R.drawable.picture_7,R.drawable.picture_8};


        recyclerView.setLayoutManager(new GridLayoutManager(getActivity(),numberOfColumns));


        // what data we want to show at recycler view
        ProductCollectionAdapter adapter = new ProductCollectionAdapter(data,path);
        recyclerView.setAdapter(adapter);

        //for animation
       //recyclerView.setItemAnimator(new SlideUpItemAnimator());

                     return  view;
    }




}
