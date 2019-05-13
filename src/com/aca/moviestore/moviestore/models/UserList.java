package com.aca.moviestore.moviestore.models;

import com.aca.moviestore.moviestore.ID;

import java.util.ArrayList;
import java.util.List;

public class UserList {
    private List<Subscriber> subscribers;

    public UserList() {
        subscribers = new ArrayList<>();
    }

    public Subscriber addUser(Subscriber user) throws RuntimeException {

        if(isInList( user )) {
            throw new RuntimeException( "The user " + user.getUsername() + " is already registered!" );
        }

        for (Subscriber s : subscribers) {
            if (s.getUsername().equals(user.getUsername()))
                throw new RuntimeException("The username " + user.getUsername() + " is already in use!");
        }

        subscribers.add( user );

        return user;
    }

    public String getUsername(Credential pair) {
        return pair.getUsername();
    }

    public Subscriber getUser(ID pair) {
        for (Subscriber user: subscribers) {
            if(user.getUsername().equals( pair.getUsername()))
                return (User) user;
        }
        return null;
    }

    public boolean isInList(ID pair) {
        return subscribers.contains(new Subscriber(pair));
    }

    public boolean isInList(Subscriber user) {
        return subscribers.contains(user);
    }

    public boolean removeUser(ID credential) {
        for (Subscriber subscriber : subscribers) {
            if (subscriber.getUsername().equals(credential.getUsername())) {
                subscribers.remove(subscriber);
                return true;
            }
        }

        return false;
    }

}
