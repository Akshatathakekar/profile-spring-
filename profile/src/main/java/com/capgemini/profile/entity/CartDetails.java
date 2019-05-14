package com.capgemini.profile.entity;

import java.util.List;

public class CartDetails {

	
	private List<Cart> cart;

	public List<Cart> getCart() {
		return cart;
	}


	public void setCart(List<Cart> cart) {
		this.cart = cart;
	}

	public CartDetails(List<Cart> cart) {
		super();
		this.cart = cart;
	}
	
	
	public CartDetails() {
		super();
		// TODO Auto-generated constructor stub
	}
	
}
