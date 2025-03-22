package com.example.movieTicketBooking;

public class BookingService {

	private Ticket ticket; // Dependency

	    // Setter Injection
	    public void setTicket(Ticket ticket) {
	        this.ticket = ticket;
	    }

	    public void bookTicket() {
	        System.out.println("Booking confirmed: " + ticket.getDetails());
	    }
	}

