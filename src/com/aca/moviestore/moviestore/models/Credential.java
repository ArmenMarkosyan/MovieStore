package com.aca.moviestore.moviestore.models;

import com.aca.moviestore.moviestore.ID;

public class Credential implements ID {
    private String username;
    private String password;

    public Credential(String username, String password) {
        this.username = username;
        this.password = password;
    }

    @Override
    public String getUsername() {
        return username;
    }

    @Override
    public void setUsername(String username) {
        this.username = username;
    }

    @Override
    public String getPassword() {
        return password;
    }

    @Override
    public void setPassword(String password) {
        this.password = password;
    }
}
