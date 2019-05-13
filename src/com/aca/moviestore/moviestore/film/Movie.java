package com.aca.moviestore.moviestore.film;

import com.aca.moviestore.moviestore.moviestaff.Staff;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Movie {
    private String title;
    private String description;
    private Genre genre;
    private Date premierDate;
    private List<Staff> staff;
    private Rating rating;
    private List<Rating> ratingList;

    public Movie(String title, String description, Genre genre, Date premierDate, List<Staff> members) {
        this.title = title;
        this.description = description;
        this.genre = genre;
        this.premierDate = premierDate;
        this.staff = members;
        this.rating = Rating.POOR;
        this.ratingList = new ArrayList<>();
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Genre getGenre() {
        return genre;
    }

    public void setGenre(Genre genre) {
        this.genre = genre;
    }

    public Date getPremierDate() {
        return premierDate;
    }

    public void setPremierDate(Date premierDate) {
        this.premierDate = premierDate;
    }

    public List<Staff> getMember() {
        return staff;
    }

    public void setMember(List<Staff> member) {
        this.staff = member;
    }

    public Rating getRating() {
        switch (calcRating()) {
            case 5:
                rating = Rating.EXCELLENT;
                break;
            case 4:
                rating = Rating.GOOD;
                break;
            case 3:
                rating = Rating.AVERAGE;
                break;
            case 2:
                rating = Rating.FAIR;
                break;
            case 1:
                rating = Rating.POOR;
                break;
            default:
                rating = Rating.NONE;
                break;
        }
        return rating;
    }

    private int calcRating() {
        int sum = 0;
        for (Rating rat : ratingList) {
            switch (rat) {
                case EXCELLENT:
                    sum += 5;
                    break;
                case GOOD:
                    sum += 4;
                    break;
                case AVERAGE:
                    sum += 3;
                    break;
                case FAIR:
                    sum += 2;
                    break;
                case POOR:
                    sum += 1;
                    break;
                default:
                    sum += 0;
                    break;
            }
        }
        return Math.round(sum / ratingList.size());
    }

    public void addRating(Rating rating) {
        ratingList.add(rating);
    }

    @Override
    public String toString() {
        return "Movie" +
                "\n title=\t\t\t" + title +
                "\n description=\t" + description +
                "\n genre=\t\t\t" + genre +
                "\n premierDate=\t" + premierDate +
                "\n member=\t\t" + staff +
                "\n rating=\t\t" + rating;
    }
}
