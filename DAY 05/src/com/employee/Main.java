package com.employee;


public class Main {
    public static void main(String[] args) {
        //object of each class
        Employee manager = new Manager("Sajid", 101, 65000, 6);
        Employee developer = new Developer("Unaiz", 201, 45000, "JAVA");
        Employee intern = new Intern("Rehan", 301, 20000);

        //calling details method
        manager.displayDetails();
        developer.displayDetails();
        intern.displayDetails();

    }
}
