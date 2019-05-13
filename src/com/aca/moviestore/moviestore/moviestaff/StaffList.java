package com.aca.moviestore.moviestore.moviestaff;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class StaffList {

    public List<Staff> getStaffForInstantFamily() {
        List<Staff> staff = new ArrayList<>();

        staff.add(new Director("Sean Anders", new Date(1963 - 1 - 1)));
        staff.add(new Writer("Sean Anders", new Date(1963 - 1 - 1)));
        staff.add(new Writer("John Morris", new Date(1963 - 1 - 1)));
        staff.add(new Star("Mark Wahlberg", new Date(1971 - 6 - 5)));
        staff.add(new Star("Rose Byrne", new Date(1979 - 7 - 24)));
        staff.add(new Star("Isabela Moner", new Date(2001 - 7 - 10)));

        return staff;
    }

    public List<Staff> getStaffForTheMule() {
        List<Staff> staff = new ArrayList<>();

        staff.add(new Director("Clint Eastwood", new Date(1930 - 5 - 31)));
        staff.add(new Writer("Sam Dolnick", new Date(1930 - 5 - 31)));
        staff.add(new Writer("Nick Schenk", new Date(1930 - 5 - 31)));
        staff.add(new Star("Clint Eastwood", new Date(1930 - 5 - 31)));
        staff.add(new Star("Patrick L. Reyes", new Date(1979 - 7 - 24)));
        staff.add(new Star("Cesar De León", new Date(2001 - 7 - 10)));

        return staff;
    }

    public List<Staff> getStaffForGlass() {
        List<Staff> staff = new ArrayList<>();

        staff.add(new Director("M. Night Shyamalan", new Date(1970 - 8 - 6)));
        staff.add(new Writer("M. Night Shyamalan", new Date(1970 - 8 - 6)));
        staff.add(new Star("James McAvoy", new Date(1979 - 4 - 21)));
        staff.add(new Star("Bruce Willis", new Date(1955 - 3 - 19)));
        staff.add(new Star("Samuel L. Jackson", new Date(1948 - 12 - 21)));

        return staff;
    }
}
