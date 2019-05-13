package com.aca.moviestore.moviestore.moviestaff;

import java.util.Date;

public class Staff {

    private String fullName;
    private String position;
    private Date birthDate;

    Staff(String fullName, String position, Date birthDate) {
        this.fullName = fullName;
        this.position = position;
        this.birthDate = birthDate;
    }

    String getFullName() {
        return fullName;
    }

    void setFullName(String fullName) {
        this.fullName = fullName;
    }

    String getPosition() {
        return position;
    }

    void setPosition(String position) {
        this.position = position;
    }

    Date getBirthDate() {
        return birthDate;
    }

    void setBirthDate(Date birthDate) {
        this.birthDate = birthDate;
    }

    @Override
    public String toString() {
        return  fullName +
                ", " + position +
                ", Born: " + birthDate;
    }
}
