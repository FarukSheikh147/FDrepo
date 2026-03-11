package com.task1;

public class Main {
	public static void main(String[]args) {
		ElectronicProduct e1= new ElectronicProduct(10, "Tablet", 20000, 2, "Apple");
		StationaryProduct s1=new StationaryProduct(11,"Pencil", 10,"Stick","Black");
		
		e1.display();
		s1.display();
		
	}

}
