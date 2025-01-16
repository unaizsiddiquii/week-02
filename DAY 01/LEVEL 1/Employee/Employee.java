package Employee;

import java.util.Scanner;
//create class Employee
public class Employee {

  //instance variabele
  public String name;
  public static int id = 100;
  public double salary;

  //constructor to initialize the instance variable
  public Employee(String name, Double salary) {
    this.name = name;
    this.id = id + 1;
    this.salary = salary;
  }

  //method to display employee details
  public void employeeDetails() {
    System.out.println("Employee name : " + name);
    System.out.println("Employee Id : " + id);
    System.out.println("Employee salary : " + salary);
  }

  public static void main(String[] args) {

    //object of Employee class
    Employee e1 = new Employee("Unaiz Siddiqui", 43000.00);
    e1.employeeDetails();
    System.out.println();
    Employee e2 = new Employee("Khushi Siddiqui", 72900.00);
    e2.employeeDetails();

  }
}
