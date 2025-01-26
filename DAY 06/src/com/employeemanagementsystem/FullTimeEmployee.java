package com.employeemanagementsystem;
//subclass of Employee class and also implement Department interface
public class FullTimeEmployee extends Employee implements Department {

    //private properties
    private int bonusSalary;
    private String departmentName;

    //constructor
    public FullTimeEmployee(int employeeId, String name, int baseSalary, int bonusSalary) {
        //calling baseclass constructor
        super(employeeId, name, baseSalary);
        this.bonusSalary = bonusSalary;
    }

    //display details of Full time employee
    @Override
    public void displayDetails() {
        System.out.println("Full Time Employee Details");
        //invoke super class method
        super.displayDetails();
        System.out.println("Base Salary: " + getBaseSalary());
        System.out.println("Salary With Bonus: " + this.calculateSalary());
    }

    //override of abstract method to calculate salary
    @Override
    public int calculateSalary() {
        return super.getBaseSalary() + bonusSalary;

    }

    //override from interface to assign department;
    @Override
    public void assignDepartment(String department) {
        this.departmentName = department;
    }

    //override from interface to get department details;
    @Override
    public String getDepartmentDetails() {
        return this.departmentName;

    }
}
