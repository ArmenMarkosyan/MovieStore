package com.aca.moviestore.moviestore.models;

import com.aca.moviestore.moviestore.ID;
import com.aca.moviestore.moviestore.film.Movie;

import java.util.ArrayList;
import java.util.List;

public class User extends Subscriber {

    private List<Movie> movieList;

    public User(ID credential) {
        super(credential);
        movieList = new ArrayList<>();
    }

    public boolean isMovieInList(Movie movie) {
        return movieList.contains(movie);
    }

    public void addMovieInOwnList(Movie movie) {
        movieList.add(movie);
    }

    public List<Movie> getRatedMovieList() {
        return movieList;
    }
}
