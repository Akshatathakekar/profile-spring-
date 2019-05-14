package com.capgemini.profile.entity;

import java.util.List;

import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class ProfileDetails {

	private int orderId;
	private String status;
	private int rating;
	private String dish;
	private double price;
	private int quantity;
	private double total;	
	private String email;
	private String imgUrl;
	
//	private CartDetails cart;
	
	public ProfileDetails() {
		super();
		// TODO Auto-generated constructor stub
	}

	public int getOrderId() {
		return orderId;
	}

	public void setOrderId(int orderId) {
		this.orderId = orderId;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public int getRating() {
		return rating;
	}

	public void setRating(int rating) {
		this.rating = rating;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getDish() {
		return dish;
	}

	public void setDish(String dish) {
		this.dish = dish;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public double getTotal() {
		return total;
	}

	public void setTotal(double total) {
		this.total = total;
	}

	public String getImgUrl() {
		return imgUrl;
	}

	public void setImgUrl(String imgUrl) {
		this.imgUrl = imgUrl;
	}

	public ProfileDetails(int orderId, String status, int rating, String dish, double price, int quantity, double total,
			String email, String imgUrl) {
		super();
		this.orderId = orderId;
		this.status = status;
		this.rating = rating;
		this.dish = dish;
		this.price = price;
		this.quantity = quantity;
		this.total = total;
		this.email = email;
		this.imgUrl = imgUrl;
	}



//	public CartDetails getCart() {
//		return cart;
//	}
//
//	public void setCart(CartDetails cart) {
//		this.cart = cart;
//	}

	






	
	
	
}
