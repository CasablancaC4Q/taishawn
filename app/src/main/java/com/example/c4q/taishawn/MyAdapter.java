package com.example.c4q.taishawn;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import java.util.ArrayList;
import java.util.zip.Inflater;

/**
 * Created by c4q on 12/4/17.
 */

class MyAdapter extends RecyclerView.Adapter<MyViewHolder> {
    ArrayList<ImageView> nameIt;

    public MyAdapter(ArrayList<ImageView> nameIt) {
        this.nameIt = nameIt;
    }

    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.pics,parent,false);

        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(MyViewHolder holder, int position) {
        holder.onBind(nameIt.get(position));



    }

    @Override
    public int getItemCount() {
        return nameIt.size();
    }
}
