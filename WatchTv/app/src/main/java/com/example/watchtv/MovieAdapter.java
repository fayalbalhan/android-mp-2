package com.example.watchtv;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class MovieAdapter extends RecyclerView.Adapter {

    ArrayList<MoviesList> mArray;
    Context context;

    public MovieAdapter(ArrayList<MoviesList> mArray, Context context) {
        this.mArray = mArray;
        this.context = context;
    }

    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        // connecting to the design xml
        View x = LayoutInflater.from(parent.getContext()).inflate(R.layout.desgin,parent,false);
        ViewHolder vh = new ViewHolder(x);
        return vh;
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, int position) {
        ((ViewHolder)holder).rating.setText(mArray.get(position).getRating()+" ");
        ((ViewHolder)holder).year.setText(mArray.get(position).getYear()+" ");
        ((ViewHolder)holder).genre.setText(mArray.get(position).getGenre()+" ");
        ((ViewHolder)holder).name.setText(mArray.get(position).getName()+" ");
        ((ViewHolder)holder).Picture.setImageResource(mArray.get(position).getPicture());

        
    }

    @Override
    public int getItemCount() {
        return mArray.size();
    }

    public static class  ViewHolder extends RecyclerView.ViewHolder{
            public ImageView Picture ;
            public TextView name;
            public TextView year;
            public TextView genre;
            public TextView rating;
            public View view;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            view = itemView; // links xml with java
            Picture = itemView.findViewById(R.id.imageView3);
            name = itemView.findViewById(R.id.Movies_Name);
            year = itemView.findViewById(R.id.Display_Year);
            genre = itemView.findViewById(R.id.Display_Genre);
            rating = itemView.findViewById(R.id.Display_Rating);
        }
    }
}
