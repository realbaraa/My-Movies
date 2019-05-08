package com.example.mymovies;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private ListView lvMovies;

    private MovieAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        lvMovies=findViewById(R.id.lvMovies);
        setAdpter();
        addMovies();
        setUpListeners();
    }

    private void addMovies() {
        Movie movie=new Movie();
        movie.setName("Forest Gump");
        movie.setIvId(R.drawable.forest);
        movie.setYear("1994");
        movie.setDirector("Robert Zemeckis");
        movie.setStoryLine(getString(R.string.forest_desc));

        adapter.add(movie);
        Movie movie2=new Movie();
        movie2.setName("Leon the professional");
        movie2.setIvId(R.drawable.leon);
        movie2.setYear("1994");
        movie2.setDirector("Luc Besson");
        movie2.setStoryLine(getString(R.string.leon_desc));
        adapter.add(movie2);
    }

    private void setUpListeners() {
        lvMovies.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Movie movie=(Movie)adapterView.getAdapter().getItem(i);
                call(movie);
            }
        });
    }

    private void call(Movie movie) {
        Intent intent = new Intent(this,movie_desc.class);
        intent.putExtra("movieObject", movie);
        startActivity(intent);
    }

    private void setAdpter() {
        adapter=new MovieAdapter(
                this,-1,new ArrayList<Movie>()
        );

        lvMovies.setAdapter(adapter);
    }
}
