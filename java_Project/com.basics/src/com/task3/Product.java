package com.task3;

abstract class Product {
	
	protected int productId;
	protected String productName;
	protected double price;
	
	public Product(int productId, String productName, double price) {
		super();
		this.productId = productId;
		this.productName = productName;
		this.price = price;
	}

	public abstract void display();
	

}
