package com.aca.moviestore.moviestore.models;

import com.aca.moviestore.moviestore.ID;
import com.aca.moviestore.moviestore.film.Movie;
import com.aca.moviestore.moviestore.film.MovieRepository;

public class Subscriber {
    private ID credential;

    public Subscriber(ID credential) {
        this.credential = credential;
    }

    void changeUsername(String username) {
        credential.setUsername(username);
    }

    void changePassword(String password) {
        credential.setPassword(password);
    }

    String getUsername() {
        return credential.getUsername();
    }

    String getPassword() {
        return credential.getPassword();
    }

    public Movie searchMovie(String title, MovieRepository movieRepository) {

        Movie movie = movieRepository.getMovie(title);

        if (movie == null)
            System.out.println("No results found for " + title);

        return movie;
    }
}
