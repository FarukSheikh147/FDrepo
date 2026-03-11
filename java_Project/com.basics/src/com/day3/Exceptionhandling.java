package com.day3;

public class Exceptionhandling {

	public static void main(String[] args) {
		try {
			int n=4/0;
			System.out.println(n);
			String str="Faruk Sheikh";
			System.out.println(str);
			
			int [] arr= {1,2,3,4};
			System.out.println(arr[7]);
		}
		catch(ArithmeticException e) {
			System.out.println("Can't divide by zero");
		}
		catch(Exception e) {
			System.out.println("Arrayindexoutofbound");
		
		

	}

}
