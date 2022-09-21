package com.book.my.movie;

public class BookMyMovie {
	int movieId;
	int noOfTickets ;
	double discount;
	double totalAmount;
	
	public BookMyMovie(int movieId, int noOfTickets) {
		this.movieId = movieId;
		this.noOfTickets = noOfTickets;
	}

	public int getMovieId() {
		return movieId;
	}

	public void setMovieId(int movieId) {
		this.movieId = movieId;
	}

	public int getNoOfTickets() {
		return noOfTickets;
	}

	public void setNoOfTickets(int noOfTickets) {
		this.noOfTickets = noOfTickets;
	}

	public double getDiscount() {
		return discount;
	}

	public void setDiscount(double discount) {
		this.discount = discount;
	}

	public double getTotalAmount() {
		return totalAmount;
	}

	public void setTotalAmount(double totalAmount) {
		this.totalAmount = totalAmount;
	}
	
	public void calculateDiscount() {
		
	}
	
	public double calculateTicketAmount() {
		return 0;
	}
	
	
	
	
}
