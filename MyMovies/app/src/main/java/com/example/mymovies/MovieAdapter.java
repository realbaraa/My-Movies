package com.example.mymovies;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

public class MovieAdapter extends ArrayAdapter<Movie> {

    private List<Movie> movies;
    private LayoutInflater layoutInflator;

    public MovieAdapter(@NonNull Context context, int resource, @NonNull List<Movie> movies) {
        super(context, resource, movies);
        this.movies = movies;
        layoutInflator=LayoutInflater.from(context);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

        if (convertView == null) {
            convertView=layoutInflator.inflate(R.layout.movie,parent,false);
        }

        final Movie movie= getItem(position);
        TextView tvName=convertView.findViewById(R.id.tvName);
        ImageView ivMovie=convertView.findViewById(R.id.ivMovie);
        tvName.setText(movie.getName());
        ivMovie.setImageResource(movie.getIvId());

        return convertView;
    }
}
