/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab;

import java.util.Scanner;

/**
 * Calculates salary of an employee
 * @author student
 */

class Employee {
    String name, city;
    int salary;
    float da, hra, totalSalary;
    
    // Initializes Employee
    public Employee(String name, String city, int salary, float da, float hra) {
        this.name = name;
        this.city = city;
        this.salary = salary;
        this.da = da;
        this.hra = hra;
    }
    
    // Calculates total salary
    public void calculate() {
        totalSalary = salary + salary * da / 100 + salary * hra / 100;
    }
    
    // Displays total salary
    public void display() {
        System.out.println("Total Salary: " + totalSalary);
    }
}

public class Lab5_EmployeeClass {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter name, city, salary, DA and HRA");
        Employee e1 = new Employee(in.nextLine(), in.nextLine(), in.nextInt(), in.nextFloat(), in.nextFloat());
        e1.calculate();
        e1.display();
    }
}
