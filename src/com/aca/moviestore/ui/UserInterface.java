package com.aca.moviestore.ui;

public interface UserInterface {
    /**
     * Send info to user.
     *
     * @param message the message,
     */
    void output(String message);


    Pair setAdmin();

    Pair loginRegisterUser();


    /**
     * Get a movie by a title.
     */
    String getMovieByTitle();
}
