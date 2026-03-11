package com.day4;

public class Main {
    public static void main(String[] args) {
        EmployeeManager manager = new EmployeeManager();

        // Add employees
        manager.addEmployee(new Employee(101, "Alice", "HR"));
        manager.addEmployee(new Employee(102, "Bob", "Engineering"));
        manager.addEmployee(new Employee(103, "Charlie", "Sales"));
        manager.addEmployee(new Employee(101, "Alice", "Marketing")); // Adding another with same ID/Name

        manager.displayAllEmployees();

        // Search for an employee by ID
        int searchId = 102;
        Employee foundEmployee = manager.searchEmployeeById(searchId);
        if (foundEmployee != null) {
            System.out.println("\nFound Employee with ID " + searchId + ": " + foundEmployee);
        } else {
            System.out.println("\nEmployee with ID " + searchId + " not found.");
        }
        
        // Search for a non-existent employee
        searchId = 999;
        foundEmployee = manager.searchEmployeeById(searchId);
        if (foundEmployee != null) {
            System.out.println("\nFound Employee with ID " + searchId + ": " + foundEmployee);
        } else {
            System.out.println("\nEmployee with ID " + searchId + " not found.");
        }
    }
}
