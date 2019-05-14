package com.capgemini.profile.entity;

import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class Feedback {

	private int orderId;
	private int rating;
	private String comments;
	
	private String email;
	
	
	
	public Feedback(int rating, String comments) {
		super();
		this.rating = rating;
		this.comments = comments;
	}
	public int getRating() {
		return rating;
	}
	public void setRating(int rating) {
		this.rating = rating;
	}
	public String getComments() {
		return comments;
	}
	public void setComments(String comments) {
		this.comments = comments;
	}
	public Feedback() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
}
