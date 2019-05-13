package com.aca.moviestore.moviestore.moviestaff;

import java.util.Date;

public class Director extends Staff{

    public Director(String fullName, Date birthDay) {
        super(fullName, "Director", birthDay);
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
