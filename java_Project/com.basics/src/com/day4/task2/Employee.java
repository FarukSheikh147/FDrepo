package com.day4.task2;
public class Employee {
    private String name;
    private double salary;

    public Employee(String name, double salary) throws InvalidSalaryException {
        this.name = name;
        setSalary(salary);
    }

    public void setSalary(double salary) throws InvalidSalaryException {
        if (salary < 0) {
            throw new InvalidSalaryException("Salary cannot be negative: " + salary);
        }
        this.salary = salary;
    }

    public double getSalary() {
        return salary;
    }
}
