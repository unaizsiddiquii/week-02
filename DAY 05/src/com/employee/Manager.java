package com.employee;

//subClass Manager
public class Manager extends Employee {

    //manager class variable
    int teamSize;

//    constructor
    public Manager(String name, int id, int salary, int teamSize) {
        super(name, id, salary);
        this.teamSize = teamSize;
    }

    //method to display details of manager
    @Override
    void displayDetails() {
        System.out.println("Manager");
        System.out.println("Name : " + name);
        System.out.println("ID : " + id);
        System.out.println("Salary : " + salary);
        System.out.println("Team Size : " + this.teamSize);
        System.out.println();
    }
}
