package com.example.recycler;



import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class BooksHolder extends RecyclerView.ViewHolder {

    private TextView text; //Bdums
    Context context;

    public BooksHolder(@NonNull View itemView, Context context) {
        super(itemView);
        this.context = context;
        text = itemView.findViewById(R.id.textView1);
        text.setOnClickListener(x -> onClick());
    }

    public void onClick() {
       AlertDialog.Builder a_builder = new AlertDialog.Builder(context);
       a_builder.setMessage("Artem")
               .setCancelable(false)
               .setPositiveButton("ok", new DialogInterface.OnClickListener() {
                   @Override
                   public void onClick(DialogInterface dialog, int which) {
                       Toast.makeText(context,"ok", Toast.LENGTH_SHORT).show();
                   }
               })
               .setNegativeButton("decline", new DialogInterface.OnClickListener() {
                   @Override
                   public void onClick(DialogInterface dialog, int which) {
                       dialog.cancel();
                   }
               });

       AlertDialog alertDialog = a_builder.create();
       alertDialog.setTitle("Artem");
       alertDialog.show();


    }

    public void bind(String name) {
        text.setText(name);
    }
}
