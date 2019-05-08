package com.example.mymovies;

import android.widget.ImageView;

import java.io.Serializable;

public class Movie implements Serializable {
    private String name;
    private String year;
    private String director;
    private String storyLine;
    private int ivId;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public String getDirector() {
        return director;
    }

    public String getStoryLine() {
        return storyLine;
    }

    public void setStoryLine(String storyLine) {
        this.storyLine = storyLine;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public int getIvId() {
        return ivId;
    }

    public void setIvId(int ivId) {
        this.ivId = ivId;
    }
}
