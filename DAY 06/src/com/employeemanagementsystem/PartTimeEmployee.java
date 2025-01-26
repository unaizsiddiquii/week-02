package com.employeemanagementsystem;

//subclass of Employee class and also implement Department interface
public class PartTimeEmployee extends Employee implements Department {
    private int workingHours;
    private int hourlySalary;
    private String departmentName;

    //constructor
    public PartTimeEmployee(int employeeId, String name, int baseSalary, int workingHours, int hourlySalary) {
        super(employeeId, name, baseSalary);
        this.workingHours = workingHours;
        this.hourlySalary = hourlySalary;
    }

    //display details of Part Time employee
    @Override
    public void displayDetails() {
        System.out.println("Part Time Employee Details");
        super.displayDetails();
        System.out.println("Hourly Working Hours: " + workingHours);
        System.out.println("Hourly Salary: " + hourlySalary);
        System.out.println("Total Salary: " + this.calculateSalary());
    }

    //override of abstract method to calculate salary
    @Override
    public int calculateSalary() {
        return workingHours * hourlySalary;
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
