package com.task1;

public class StationaryProduct extends Product {
	
	private String material;
	private String color;
	public StationaryProduct(int productId, String productName, double price, String color, String material) {
		super(productId, productName, price);
		this.material=material;
		this.color=color;

	}
	@Override
	public void display() {
		super.display();
		System.out.println("Material:"+material);
		System.out.println("Color"+color);
	
	}
	

}
