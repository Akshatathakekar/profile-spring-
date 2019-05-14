package com.capgemini.profile.entity;

public class Cart {

	private String dish;
	private double price;
	private int quantity;
	private double total;
	

	public Cart() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Cart(String dish, double price, int quantity, double total) {
		super();
		this.dish = dish;
		this.price = price;
		this.quantity = quantity;
		this.total = total;
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
	
	
	
}
