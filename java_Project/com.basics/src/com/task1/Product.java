package com.task1;

public class Product {

	private int productId;
	private String productName;
	private double price;
	public Product(int productId, String productName, double price) {
		
		this.productId = productId;
		this.productName = productName;
		this.price = price;
	}
	
	public void display() {
		System.out.println("Product Id:"+productId);
		System.out.println("Product Name:"+productName);
		System.out.println("Product Price:"+price);
	}
    
	
	
}
