package com.aca.moviestore.film;

import com.aca.moviestore.moviestore.film.Genre;
import com.aca.moviestore.moviestore.film.Movie;
import com.aca.moviestore.moviestore.film.MovieRepository;
import com.aca.moviestore.moviestore.film.Rating;
import com.aca.moviestore.moviestore.moviestaff.*;
import testutil.Assert;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class TestMovie {

    public static MovieRepository movieRepository = new MovieRepository();

    public static void main(String[] args) {
        run();
    }

    public static void run() {
        testMovieRepository();
        System.out.println( "Movie Repository tests are passed." );
    }

    private static void testMovieRepository() {
        movieRepository.fillRepository();
        Movie movie = movieRepository.getMovie( "The Mule" );
        Assert.equals( movie.getTitle(), "The Mule" );

        movie.setGenre( Genre.ACTION );
        Assert.equals( movie.getGenre(), Genre.ACTION );

        movie.addRating( Rating.FAIR );
        Assert.equals( movie.getRating(), Rating.FAIR );

        List<Staff> staffList = getStaffForColdPursuit();

        movie = new Movie( "Cold Pursuit",
                "A grieving snowplow driver seeks out revenge against the drug dealers who killed his son. Based on the 2014 Norwegian film 'In Order of Disappearance'.",
                Genre.ACTION, new Date( 2019 - 2 - 22 ), staffList );

        Assert.equals( staffList.get( 2 ).toString().contains( "John Morris" ), true);
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
}
