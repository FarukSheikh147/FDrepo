package com.emp.abstractclass;

public abstract class Employee {
	protected int empId;
	protected String name;
	protected double basicSalary;
	
	public Employee(int empId, String name,double basicSalary) {
		super();
		this.empId=empId;
		this.name=name;
		this.basicSalary=basicSalary;
	}
     // It is an abstract method . we dont know the implementation 
    public abstract double calculateSalary();
    
    public void displayDetails() {
        System.out.println("Employee ID: " + empId);
        System.out.println("Name: " + name);
        System.out.println("Basic Salary: " + basicSalary);
    }

}
