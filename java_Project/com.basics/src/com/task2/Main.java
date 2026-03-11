package com.task2;


public class Main {
	public static void main(String[]args) {
	       Product pr1= new ElectronicProduct(10, "Tablet", 20000, 2, "Apple");
		   Product pr2= new StationaryProduct(11,"Pencil", 10,"Stick","Black");
		
		pr1.display();
		pr1.calculateDiscount(10);
		
		System.out.println();
		
		pr2.display();
		pr1.calculateDiscount(5);
		
	}

}
