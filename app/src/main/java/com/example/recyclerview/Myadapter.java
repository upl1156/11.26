package com.example.recyclerview;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class Myadapter extends RecyclerView.Adapter<Myadapter.Viewholder> {

    Context context;
    String[] title;
    String[] description;
    int[] icon;

    //Constructor

    public Myadapter(Context context, String[] title, String[] description, int[] icon){
        this.context = context;
        this.title = title;
        this.description = description;
        this.icon = icon;
    }

    @NonNull
    @Override
    public Viewholder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(context);
//        View v = inflater.inflate(R.layout.itemview,parent,false);
        View v = inflater.inflate(R.layout.resorce,parent,false);
        return new Viewholder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull Viewholder holder, int position) {
        holder.title.setText(title[position]);
        holder.description.setText(description[position]);
        holder.icon.setImageResource(icon[position]);

    }

    @Override
    public int getItemCount() {
        return title.length;
    }

    public static class Viewholder extends RecyclerView.ViewHolder {

        TextView title;
        TextView description;
        ImageView icon;

        public Viewholder(@NonNull View itemView) {
            super(itemView);
            title = itemView.findViewById(R.id.TV_Titlehere);
            description = itemView.findViewById(R.id.TV_DesHere);
            icon = itemView.findViewById(R.id.IV_IconHere);
        }
    }


}
