package com.emp.abstractclass;

public class PermanentEmployee extends Employee{
	private double bonus;
	private double pf;
	public PermanentEmployee(int empId, String name, double basicSalary, double bonus, double pf) {
		super(empId, name, basicSalary);
		this.bonus = bonus;
		this.pf = pf;
	}
	@Override
	public double calculateSalary() {	
		return basicSalary + bonus - pf;
	}
	
}