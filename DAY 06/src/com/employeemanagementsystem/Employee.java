package com.employeemanagementsystem;

//Super and abstract class
public abstract class Employee {

    //Private properties for encapsulation
    private int employeeId;
    private String name;
    private int baseSalary;

    //constructor
    public Employee(int employeeId, String name, int baseSalary) {
        this.employeeId = employeeId;
        this.name = name;
        this.baseSalary = baseSalary;
    }

    //abstract method that will must override by subclass
    public abstract int calculateSalary();

    public void displayDetails() {
        System.out.println("Employee ID: " + employeeId);
        System.out.println("Name: " + name);

    }

    //getter of baseSalary
    public int getBaseSalary() {
        return baseSalary;
    }
}
