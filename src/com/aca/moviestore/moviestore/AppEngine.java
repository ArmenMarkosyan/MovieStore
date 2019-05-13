package com.aca.moviestore.moviestore;

import com.aca.moviestore.moviestore.film.Movie;
import com.aca.moviestore.moviestore.film.MovieRepository;
import com.aca.moviestore.moviestore.models.Admin;
import com.aca.moviestore.moviestore.models.Subscriber;
import com.aca.moviestore.moviestore.models.UserList;

public class AppEngine {

    private AppStatus appStatus = AppStatus.IN_PROGRESS;
    private MovieRepository movieRepository;
    private Subscriber admin;
    private UserList userList;
    private Subscriber user;
    private Movie movie;

    public AppEngine() {
        movieRepository = new MovieRepository();
        userList = new UserList();
    }

    public void fillMovieRepository() {
        movieRepository.fillRepository();
    }

    public String showMoviesRepositoryContent() {
        return movieRepository.toString();
    }

    public void addAdmin(ID pair) {
        this.admin = new Admin( pair );
    }

    public void setUser(ID pair) {
        user = userList.getUser( pair );
        if (user == null) {
            user = userList.addUser( new Subscriber( pair ) );
        }
    }

    public String searchMovie(String title) {
        movie = user.searchMovie( title, movieRepository );

        appStatus = AppStatus.FINISHED;

        return movie.toString();
    }

    public boolean isAppFinished() {
        return appStatus == AppStatus.IN_PROGRESS;
    }
}
