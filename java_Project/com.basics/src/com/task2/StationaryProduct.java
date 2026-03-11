package com.task2;


class StationaryProduct extends Product {
	
	private String material;
	private String color;
	public StationaryProduct(int productId, String productName, double price, String color, String material) {
		super(productId, productName, price);
		this.material=material;
		this.color=color;

	}
	@Override
	public void display() {
		System.out.println("ID:"+productId);
		System.out.println("Name:"+productName);
		System.out.println("Price:"+price);
		System.out.println("material:"+material);
		System.out.println("Color"+color);
	}
	

}
