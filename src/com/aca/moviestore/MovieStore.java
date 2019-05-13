package com.aca.moviestore;

import com.aca.moviestore.moviestore.AppEngine;
import com.aca.moviestore.moviestore.ID;
import com.aca.moviestore.moviestore.film.Movie;
import com.aca.moviestore.ui.CommandLineUserInterface;
import com.aca.moviestore.ui.GraphicalUserInterface;
import com.aca.moviestore.ui.UserInterface;

public class MovieStore {

    private UserInterface userInterface;
    private AppEngine appEngine;
    private ID pair;
    private String title;
    private Movie movie;

    public MovieStore(StoreType storeType) {
        switch (storeType) {
            case COMMAND_LINE:
                userInterface = new CommandLineUserInterface();
                break;
            case GRAPHICAL_UI:
                userInterface = new GraphicalUserInterface();
                break;
        }

        appEngine = null;
    }

    public void start() {
        initialize();

        String message = null;
        try {
            message = appLoop();
        }catch (Exception msg){
            userInterface.output(msg.toString());
        }
        userInterface.output(message);
    }

    private String appLoop() {

        while (appEngine.isAppFinished()) {
            pair = userInterface.loginRegisterUser();
            appEngine.setUser(pair);

            title = userInterface.getMovieByTitle();
            userInterface.output( appEngine.searchMovie( title ));
        }

        return "Movie Store is closed!";
    }

    private void initialize() {
        appEngine = new AppEngine();

        appEngine.fillMovieRepository();

        String movies = appEngine.showMoviesRepositoryContent();

        //userInterface.output( movies );

        pair = userInterface.setAdmin();
        appEngine.addAdmin(pair);
    }
}
