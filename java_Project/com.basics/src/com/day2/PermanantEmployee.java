package com.day2;

public class PermanantEmployee extends Employee {
	int bonus;

	public PermanantEmployee(int empId, String name, double salary,int bonus) {
		super(empId, name, salary);
		
		this.bonus=bonus;
	}
public void calculatePerk(int bonus) {
	
	System.out.println(bonus+salary);
	
}

public void calculatePerk(int hra, int bonus) {
	System.out.println(bonus+salary+hra);
	
}
public void displayDetails()
{
	// Calling Display Method of Parent class
	super.displayDetails();
	System.out.println(bonus);
}
}
