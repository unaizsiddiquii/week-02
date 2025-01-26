package com.employeemanagementsystem;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.List;

public class EmployeeManagementSystem {
    public static void main(String[] args) {

        //create list of employee
        List<Employee> employeeList = new ArrayList<Employee>();

        //object of full time employee
        FullTimeEmployee fullTimeEmployee = new FullTimeEmployee(101, "Unaiz Siddiqui", 30000, 8000);

        //assigning the Department
        fullTimeEmployee.assignDepartment("IT");
        employeeList.add(fullTimeEmployee);

        PartTimeEmployee partTimeEmployee = new PartTimeEmployee(202, "Asad Khan", 20000, 20, 100);

        //assigning the Department
        partTimeEmployee.assignDepartment("HR");

        //adding to list
        employeeList.add(partTimeEmployee);

        //displaying the list
        for (Employee employee : employeeList) {

            //displaying the details
            employee.displayDetails();

            //check current object is instance of department or not
            if (employee instanceof Department) {

                //print department
                System.out.println("Department Name: " + ((Department) employee).getDepartmentDetails());
            }
            System.out.println();
        }


    }
}
