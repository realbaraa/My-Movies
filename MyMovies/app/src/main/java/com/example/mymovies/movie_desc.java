package com.example.mymovies;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class movie_desc extends AppCompatActivity {

    private ImageView ivMovie;
    private TextView tvName;
    private TextView tvDirector;
    private TextView tvYear;
    private TextView tvStory;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_movie_desc);
        initWidgets();

        Intent i = getIntent();
        Movie movie = (Movie)i.getSerializableExtra("movieObject");

        ivMovie.setImageResource(movie.getIvId());
        tvStory.setText(movie.getStoryLine());
        tvName.setText(movie.getName());
        tvYear.setText(movie.getYear());
        tvDirector.setText(movie.getDirector());

    }

    private void initWidgets() {
        ivMovie=findViewById(R.id.ivMovies);
        tvDirector=findViewById(R.id.tvDirector);
        tvName=findViewById(R.id.tvName);
        tvYear=findViewById(R.id.tvYear);
        tvStory=findViewById(R.id.tvStory);
    }
}
