package com.example.schoolapp;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class SectionAdapter extends RecyclerView.Adapter {

    ArrayList<Section> sArray;
    Context context;

    public SectionAdapter(ArrayList<Section> sArray, Context context) {
        this.sArray = sArray;
        this.context = context;
    }

    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        //connecting to movie_list_item xml
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.section_list_item,parent,false);
        ViewHolder vh = new ViewHolder(v);
        return vh;
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, int position) {
        ((ViewHolder) holder).eduLevel.setText(sArray.get(position).getEduLevel()+"");
        ((ViewHolder) holder).name.setText(sArray.get(position).getName()+"");
        ((ViewHolder) holder).img.setImageResource(sArray.get(position).getImg());
    }

    @Override
    public int getItemCount() {
        return sArray.size();
    }
    public class ViewHolder extends RecyclerView.ViewHolder{

        public TextView eduLevel;
        public TextView name;
        public ImageView img;
        public View view;


        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            view = itemView; //مهم جدا
            eduLevel = itemView.findViewById(R.id.edu);
            name = itemView.findViewById(R.id.sname);
            img = itemView.findViewById(R.id.imageView);
        }
    }
}
