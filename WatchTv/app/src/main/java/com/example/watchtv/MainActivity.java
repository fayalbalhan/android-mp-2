package com.example.watchtv;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ArrayList<MoviesList> MovieItems = new ArrayList<>();
        MoviesList a = new MoviesList("The Man Who Knew Infinity","Biography",2015,7.2,R.drawable.tm_hki);
        MoviesList b = new MoviesList("Hidden Figures", "History / Drama",2016,7.8,R.drawable.hidden_figures);
        MoviesList c = new MoviesList("ocean's 8", "Comedy / Crime", 2018,6.9,R.drawable.oceans_s8);
        MoviesList d = new MoviesList("Us", "Horror",2019,6.8, R.drawable.us_poster);

        MovieItems.add(a);
        MovieItems.add(b);
        MovieItems.add(c);
        MovieItems.add(d);

        // rv alignment with the linear layout
        RecyclerView Movies = findViewById(R.id.rv);
        Movies.setHasFixedSize(true);
        RecyclerView.LayoutManager lm = new LinearLayoutManager(this);
        Movies.setLayoutManager(lm);
        MovieAdapter y = new MovieAdapter(MovieItems,MainActivity.this);
        Movies.setAdapter(y);
    }
}