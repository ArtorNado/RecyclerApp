package com.example.recycler;


import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class BooksAdapter extends RecyclerView.Adapter<BooksHolder> {

    private ArrayList<String> list;
    Context context;

    public BooksAdapter(ArrayList<String> list, Context context) {
        this.list = list;
        this.context = context;
    }

    @NonNull
    @Override
    public BooksHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View v = LayoutInflater.from(viewGroup.getContext())
                .inflate(R.layout.item, viewGroup, false);
        return new BooksHolder(v,context);
    }

    @Override
    public void onBindViewHolder(@NonNull BooksHolder booksHolder, int i) {
        booksHolder.bind(list.get(i));
    }


    @Override
    public int getItemCount() {
        return list.size();
    }

}