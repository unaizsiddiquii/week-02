package com.employee;

//subclass intern
public class Intern extends Employee {


    public Intern(String name, int id, int salary) {
        super(name, id, salary);
    }

    //method to display details of intern
    @Override
    void displayDetails() {
        System.out.println("Intern");
        System.out.println("Name : " + name);
        System.out.println("ID : " + id);
        System.out.println("Salary : " + salary);
        System.out.println();
    }
}
