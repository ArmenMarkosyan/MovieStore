package com.aca;

import com.aca.moviestore.MovieStore;
import com.aca.moviestore.StoreType;

public class Main {
    public static void main(String[] args) {

        // Create store with given interface type
        MovieStore movieStore = new MovieStore(StoreType.COMMAND_LINE);

        // Start the application
        movieStore.start();
    }
}
