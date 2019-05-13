package com.aca.moviestore.moviestore.models;

import com.aca.moviestore.moviestore.ID;
import com.aca.moviestore.moviestore.film.Movie;
import com.aca.moviestore.moviestore.film.MovieRepository;

public class Admin extends Subscriber {

    public Admin(ID credential) {
        super( credential );
    }

    void addMovie(Movie movie, MovieRepository movieRepository) {
        movieRepository.addMovie( movie );
    }

    void addNewUser(ID pair, UserList userList) throws RuntimeException {
        userList.addUser( new User( pair ) );
    }
}
