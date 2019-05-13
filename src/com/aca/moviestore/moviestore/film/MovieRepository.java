package com.aca.moviestore.moviestore.film;

import com.aca.moviestore.moviestore.models.User;
import com.aca.moviestore.moviestore.moviestaff.*;

import java.util.*;

public class MovieRepository {
    private Map<Movie, Rating> movieList;

    public MovieRepository() {
        movieList = new HashMap<>();
    }

    public void fillRepository() {

        StaffList staffList = new StaffList();

        Movie InstantFamily = new Movie("Instant Family",
                "A couple find themselves in over their heads when they foster three children.",
                Genre.COMEDY, new Date(2018 - 11 - 16), staffList.getStaffForInstantFamily());

        Movie TheMule = new Movie("The Mule",
                "A 90-year-old horticulturist and Korean War veteran turns drug mule for a Mexican cartel.",
                Genre.DRAMA, new Date(2018 - 12 - 10), staffList.getStaffForTheMule());

        Movie Glass = new Movie("Glass",
                "Security guard David Dunn uses his supernatural abilities to track Kevin Wendell Crumb, a disturbed man who has twenty-four personalities.",
                Genre.ACTION, new Date(2019 - 1 - 7), staffList.getStaffForGlass());

        addMovie(InstantFamily);
        addMovie(TheMule);
        addMovie(Glass);
    }

    public void addMovie(Movie movie) {
        String title = movie.getTitle();
        for (Movie m : movieList.keySet()) {
            if (m.getTitle().equals(title))
                throw new RuntimeException("The movie \"" + title + "\" is already exists!");
        }
        movieList.put(movie, Rating.NONE);
    }

    public Movie getMovie(String title) {
        for (Movie m : movieList.keySet()) {
            if (m.getTitle().equals(title))
                return m;
        }
        throw new RuntimeException("There is no movie by title \"" + title + "\" !");
    }

    public Rating getRating(String title) {
        for (Movie m : movieList.keySet()) {
            if (m.getTitle().equals(title))
                return movieList.get(getMovie(title));
        }
        throw new RuntimeException("There is no movie by title \"" + title + "\" !");
    }

    public void addRating(String title, User user, Rating rating) {
        Movie movie = getMovie(title);
        if (user.isMovieInList(movie))
            throw new RuntimeException("You have already rate the movie \"" + title + "\" !");

        user.addMovieInOwnList(movie);

        movieList.put(movie, rating);
    }

    public String getTitle(Movie movie) {
        return movie.getTitle();
    }

    public boolean isInList(Movie movie){
        return movieList.containsKey(movie);
    }

    public void removeMovie(String title) {
        for (Movie m : movieList.keySet()) {
            if (m.getTitle().equals(title))
                movieList.remove(getMovie(title));
        }
        throw new RuntimeException("There is no movie by title \"" + title + "\" in repository to be removed!");
    }

    @Override
    public String toString() {
        String message = null;
        for (Movie movie: movieList.keySet()) {
            message += movie.toString() + "\n\n";
        }
        return message;
    }
}
