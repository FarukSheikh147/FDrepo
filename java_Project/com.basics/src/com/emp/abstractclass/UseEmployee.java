package com.emp.abstractclass;

public class UseEmployee {

	public static void main(String[] args) {
		Employee e1 =  new PermanentEmployee(1, "abc", 4500, 500, 200);
		e1.displayDetails();
		System.out.println(e1.calculateSalary());
	}

}