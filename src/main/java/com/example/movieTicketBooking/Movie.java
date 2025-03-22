package com.example.movieTicketBooking;

public class Movie {
    private String name;
    private String showTime;

    // Constructor
    public Movie(String name, String showTime) {
        this.name = name;
        this.showTime = showTime;
    }

    // Getters
    public String getName() { return name; }
    public String getShowTime() { return showTime; }
}