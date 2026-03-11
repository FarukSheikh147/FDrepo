package com.task2;

abstract class Product {

	protected int productId;
	protected String productName;
	protected double price;
	public Product(int productId, String productName, double price) {
		
		this.productId = productId;
		this.productName = productName;
		this.price = price;
	}
	
	public void calculateDiscount(double percentage) {
		double discount = price*percentage/100;
		double finalPrice=price-discount;
		System.out.println("Price After:"+percentage+"% discount"+finalPrice);
	}
    
	public abstract void display();
	
}

