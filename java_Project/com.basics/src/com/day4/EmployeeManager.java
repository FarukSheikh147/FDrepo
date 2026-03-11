package com.day4;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class EmployeeManager {
    // HashMap for fast search by ID
    private final Map<Integer, Employee> employeeMap = new HashMap<>();
    // ArrayList to store all employees (if needed for other operations like iteration)
    private final List<Employee> employeeList = new ArrayList<>();

    /**
     * Adds an employee to the collection.
     * Overriding equals() and hashCode() is crucial here to prevent duplicate keys 
     * in hash-based collections if the Employee object itself was the key.
     */
    public void addEmployee(Employee emp) {
        if (emp != null) {
            employeeMap.put(emp.getId(), emp);
            employeeList.add(emp);
        }
    }

    /**
     * Searches for an employee by their ID.
     * @param id The ID of the employee to search for.
     * @return The Employee object, or null if not found.
     */
    public Employee searchEmployeeById(int id) {
        // HashMap provides efficient O(1) average time complexity for lookup by key
        return employeeMap.get(id);
    }

    public void displayAllEmployees() {
        System.out.println("Current Employees:");
        for (Employee emp : employeeList) {
            System.out.println(emp);
        }
    }
}
