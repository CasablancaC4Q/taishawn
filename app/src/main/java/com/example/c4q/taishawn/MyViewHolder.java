package com.example.c4q.taishawn;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;

/**
 * Created by c4q on 12/4/17.
 */

class MyViewHolder  extends RecyclerView.ViewHolder{

    ImageView imageView;

    public MyViewHolder(View itemView) {
        super(itemView);
        imageView = itemView.findViewById(R.id.image_id);

    }

    public void onBind(ImageView imageView1){
        imageView.setImageDrawable(imageView1.getDrawable());
        imageView.setImageResource(R.drawable.brian);
    }

}
