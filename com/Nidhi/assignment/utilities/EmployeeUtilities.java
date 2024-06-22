package com.Nidhi.assignment.utilities;

import com.Nidhi.assignment.employees.Developer;
import com.Nidhi.assignment.employees.Employee;
import com.Nidhi.assignment.employees.Manager;


public class EmployeeUtilities {

    public static void increaseSalary(Employee employee, double percentage) {
        double newSalary = employee.getSalary() * (1 + percentage / 100);
        employee.setSalary(newSalary);
    }

    public static void printEmployeeDetails(Employee employee) {
        System.out.println("Name: " + employee.getName());
        System.out.println("Employee ID: " + employee.getEmployeeId());
        System.out.println("Salary: " + employee.getSalary());

        if (employee instanceof Manager) {
            Manager manager = (Manager) employee;
            System.out.println("Department: " + manager.getDepartment());
        } else if (employee instanceof Developer) {
            Developer developer = (Developer) employee;
            System.out.println("Programming Language: " + developer.getProgrammingLanguage());
        }
    }
}
