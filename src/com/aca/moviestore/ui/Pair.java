package com.aca.moviestore.ui;

import com.aca.moviestore.moviestore.ID;

public class Pair implements ID {
    private String username;
    private String password;

    public Pair(String username, String password) {
        this.username = username;
        this.password = password;
    }

    @Override
    public void setUsername(String username) {

    }

    @Override
    public void setPassword(String password) {

    }

    @Override
    public String getUsername() {
        return username;
    }

    @Override
    public String getPassword() {
        return password;
    }
}
