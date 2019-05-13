package com.aca.moviestore.models;

import com.aca.moviestore.moviestore.ID;
import com.aca.moviestore.moviestore.film.Genre;
import com.aca.moviestore.moviestore.film.Movie;
import com.aca.moviestore.moviestore.film.MovieRepository;
import com.aca.moviestore.moviestore.film.Rating;
import com.aca.moviestore.moviestore.models.Credential;
import com.aca.moviestore.moviestore.models.User;
import com.aca.moviestore.moviestore.moviestaff.Director;
import com.aca.moviestore.moviestore.moviestaff.Staff;
import com.aca.moviestore.moviestore.moviestaff.Star;
import com.aca.moviestore.moviestore.moviestaff.Writer;
import testutil.Assert;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class TestUser implements ID {
    public static User user;

    public static void main(String[] args) {
        user = new User( new Credential( "testUsername", "testPassword" ) );
        run();
    }

    public static void run() {
        testUser();
        System.out.println( "Movie Repository tests are passed." );
    }

    private static void testUser() {
        List<Staff> staffList = getStaffForColdPursuit();

        Movie movie = movie = new Movie( "Cold Pursuit",
                "A grieving snowplow driver seeks out revenge against the drug dealers who killed his son. Based on the 2014 Norwegian film 'In Order of Disappearance'.",
                Genre.ACTION, new Date( 2019 - 2 - 22 ), staffList );

        user.isMovieInList( movie );
        MovieRepository movieRepository = new MovieRepository();
        movieRepository.addMovie( movie );
        movieRepository.addRating( "Cold Pursuit", user, Rating.EXCELLENT );

        Assert.equals( movieRepository.getRating( "Cold Pursuit" ), Rating.EXCELLENT );
        Assert.equals( movieRepository.getTitle( movie ), "Cold Pursuit" );

        try {
            movieRepository.addRating( "Cold", user, Rating.EXCELLENT );
        } catch (RuntimeException message) {
            System.out.println( message );
        }

        Movie movie2 = null;
        Assert.equals( movieRepository.isInList( movie2 ), false );
    }

    private static List<Staff> getStaffForColdPursuit() {
        List<Staff> staff = new ArrayList<>();

        staff.add( new Director( "Sean Anders", new Date( 1963 - 1 - 1 ) ) );
        staff.add( new Writer( "Sean Anders", new Date( 1963 - 1 - 1 ) ) );
        staff.add( new Writer( "John Morris", new Date( 1963 - 1 - 1 ) ) );
        staff.add( new Star( "Mark Wahlberg", new Date( 1971 - 6 - 5 ) ) );
        staff.add( new Star( "Rose Byrne", new Date( 1979 - 7 - 24 ) ) );
        staff.add( new Star( "Isabela Moner", new Date( 2001 - 7 - 10 ) ) );

        return staff;
    }

    @Override
    public void setUsername(String username) {

    }

    @Override
    public void setPassword(String password) {

    }

    @Override
    public String getUsername() {
        return null;
    }

    @Override
    public String getPassword() {
        return null;
    }
}
