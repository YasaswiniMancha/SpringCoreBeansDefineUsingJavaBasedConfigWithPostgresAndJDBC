package com.example.movieTicketBooking;

public class Ticket {
    private Movie movie; // Dependency 
    private String seatNumber;

    // Constructor Injection
    public Ticket(Movie movie, String seatNumber) {
        this.movie = movie;
        this.seatNumber = seatNumber;
    }

    public String getDetails() {
        return "Ticket for " + movie.getName() + " at " + movie.getShowTime() + ", Seat: " + seatNumber;
    }
}