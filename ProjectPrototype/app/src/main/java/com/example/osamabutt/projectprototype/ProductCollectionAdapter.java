package com.example.osamabutt.projectprototype;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by syed_ on 1/13/2018.
 */

public class ProductCollectionAdapter extends RecyclerView.Adapter<ProductCollectionAdapter.ProductCollectionHolder>
{
    private String[] data;
    private int[] path;
    public ProductCollectionAdapter(String[] data,int[] path)
    {
        this.data = data;
        this.path = path;
    }

    @Override
    public ProductCollectionHolder onCreateViewHolder(ViewGroup parent, int viewType)
    {
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        View view = inflater.inflate(R.layout.productitem,parent,false);
        return new ProductCollectionHolder(view);
    }

    @Override
    public void onBindViewHolder(ProductCollectionHolder holder, int position)
    {
        String title = data[position];
        holder.txtTitle.setText(title);
        int src = path[position];
        holder.imgIcon.setImageResource(src);
    }



    @Override
    public int getItemCount()
    {
        return data.length;
    }


    public class ProductCollectionHolder extends RecyclerView.ViewHolder
    {
        ImageView imgIcon;
        TextView txtTitle;
        public ProductCollectionHolder(View itemView)
        {
            super(itemView);
            imgIcon = (ImageView) itemView.findViewById(R.id.imgvew1);
            txtTitle = (TextView) itemView.findViewById(R.id.txtVew1);
        }
    }

}
