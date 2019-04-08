package com.example.recycler;


import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class BooksHolder extends RecyclerView.ViewHolder {

    private TextView text;

    public BooksHolder(@NonNull View itemView) {
        super(itemView);
        text = itemView.findViewById(R.id.textView1);
        text.setOnClickListener(x -> onClick());
    }

    public void onClick() {
        text.setText("Ержан, встайвай, на работу пора");
    }

    public void bind(String name) {
        text.setText(name);
    }
}
