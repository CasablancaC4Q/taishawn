package com.example.c4q.taishawn;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import java.util.ArrayList;


public class FirstFragment extends Fragment {

    RecyclerView recyclerView;
    ArrayList<ImageView> imageList;



    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_first, container, false);
        recyclerView = view.findViewById(R.id.recycler);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getContext());
        recyclerView.setLayoutManager(linearLayoutManager);

        imageList= new ArrayList<>();
        imageList.add(R.drawable.brian)

        MyAdapter adapter = new MyAdapter(imageList);
        recyclerView.setAdapter(adapter);



        return view;
    }




}
