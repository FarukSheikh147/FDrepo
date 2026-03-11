package com.day2;

public class ContractualEmployee extends Employee{
 int noOfHours;
	public ContractualEmployee(int empId, String name, double salary, int noOfHours ) {
		super(empId, name, salary);
		this.noOfHours=noOfHours;
	}

	

}
