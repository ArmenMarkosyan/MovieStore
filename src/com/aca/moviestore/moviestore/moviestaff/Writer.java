package com.aca.moviestore.moviestore.moviestaff;

import java.util.Date;

public class Writer extends Staff{

    public Writer(String fullName, Date birthDay) {
        super(fullName, "Writer", birthDay);
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
