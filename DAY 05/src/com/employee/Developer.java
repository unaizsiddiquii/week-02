package com.employee;

//subclass Developer
public class Developer extends Employee {
    String programmingLanguage;

    public Developer(String name, int id, int salary, String programmingLanguage) {
        super(name, id, salary);
        this.programmingLanguage = programmingLanguage;
    }

    //method to display details of Developer
    @Override
    void displayDetails() {
        System.out.println("Developer");
        System.out.println("Name : " + name);
        System.out.println("ID : " + id);
        System.out.println("Salary : " + salary);
        System.out.println("Programming Language : " + this.programmingLanguage);
        System.out.println();
    }
}
