package com.day2;

	class Employee {
	    protected int empId;
	    protected String name;
	    protected double salary;

	    public Employee(int empId, String name, double salary) {
	        this.empId = empId;
	        this.name = name;
	        this.salary = salary;
	    }
	    
	   

	    // Method to calculate salary (to be overridden)
	    public double calculateSalary() {
	        return salary;
	    }

	    public void displayDetails() {
	        System.out.println("Employee ID: " + empId + ", Name: " + name + ", Base Salary: " + salary);
	    }



	
	}


