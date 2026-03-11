package com.task3;

public class ElectronicProduct extends Product implements Taxable{

	public ElectronicProduct(int productId, String productName, double price) {
		super(productId, productName, price);
	}
		@Override
		public double calculateTax() {
			return price * 0.18;
		}
		@Override
		public void display() {
			
			System.out.println("ElectronicProduct:"+productId);
	
			System.out.println("Price:"+price);
			
			System.out.println("Tax:"+calculateTax());
		
	}

}
