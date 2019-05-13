package com.aca.moviestore.ui;

import java.util.Scanner;

public class CommandLineUserInterface implements UserInterface {

    private Pair pair;

    @Override
    public void output(String message) {
        System.out.println(message);
    }

    @Override
    public Pair setAdmin() {
        output("Setting administrator credentials.");
        setupUserPassword();

        return pair;
    }

    @Override
    public Pair loginRegisterUser() {
        output("Setting/Checking user credentials.");
        setupUserPassword();

        return pair;
    }

    @Override
    public String getMovieByTitle() {
        output("Search for a movie: ");

        Scanner scanner = new Scanner(System.in);
        return scanner.nextLine();
    }

    private void setupUserPassword() {
        Scanner scanner = new Scanner(System.in);

        output("\tusername: ");
        String username = scanner.next();

        output("\tpassword: ");
        String password = scanner.next();

        pair = new Pair(username, password);
    }
}
