package com.example.optionmenu;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class myadapter extends RecyclerView.Adapter<myadapter.myclass>{

    Context c;

    public myadapter(Context c) {

        this.c = c;
    }

    class myclass extends RecyclerView.ViewHolder{

        ImageView imageView;

        public myclass(@NonNull View itemView) {
            super(itemView);
            imageView = itemView.findViewById(R.id.text);
        }
    }

    @NonNull
    @Override
    public myclass onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(c).inflate(R.layout.activity_item,parent,false);
        myclass m = new myclass(view);
        return m;
    }

    @Override
    public void onBindViewHolder(@NonNull myclass holder, int position) {
        holder.imageView.setImageResource(config.image[position]);
    }

    @Override
    public int getItemCount() {
        return config.image.length;
    }
}
