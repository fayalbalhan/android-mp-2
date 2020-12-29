package com.example.watchtv;




public class MoviesList {

    private  String name;
    private String genre ;
    private int year ;
    private double rating ;
    private double duration;
    private int picture;

    public MoviesList(String name, String genre, int year, double rating, int picture) {
        this.name = name;
        this.genre = genre;
        this.year = year;
        this.rating = rating;
        this.picture = picture;
    }

    public String getName() { return name; }

    public void setName(String name) { this.name = name; }

    public String getGenre() { return genre; }

    public void setGenre(String genre) { this.genre = genre; }

    public int getYear() { return year; }

    public void setYear(int year) {
        if (year >= 2015 )
            this.year = year;
        else
            System.out.println("Sorry we only have movies from 2015 and above.");
    }

    public double getRating() { return rating; }

    public void setRating(double rating) {
        if (rating<=10)
            this.rating = rating;
        else
            System.out.println("Invalid Input");
    }

    public double getDuration() { return duration; }

    public void setDuration(double duration) { this.duration = duration; }

    public int getPicture() { return picture; }

    public void setPicture(int picture) { this.picture = picture; }
}
