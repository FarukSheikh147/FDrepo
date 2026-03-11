package com.emp.abstractclass;

public class ContractualEmployee  extends Employee{
	private int hourWork;
	private double hourlyRate;
	public ContractualEmployee(int empId, String name, double basicSalary, int hourWork, double hourlyRate) {
		super(empId, name, basicSalary);
		this.hourWork = hourWork;
		this.hourlyRate = hourlyRate;
	}
	@Override
	public double calculateSalary() {
		return basicSalary + (hourWork * hourlyRate);
	}
	
}