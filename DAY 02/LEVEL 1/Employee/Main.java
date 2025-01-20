// Base class
class Employee {
    public int employeeID;
    protected String department;
    private double salary;

    // Constructor
    public Employee(int employeeID, String department, double salary) {
        this.employeeID = employeeID;
        this.department = department;
        this.salary = salary;
    }

    // Public method to modify the salary
    public void setSalary(double salary) {
        if (salary > 0) {
            this.salary = salary;
        } else {
            System.out.println("Invalid salary amount!");
        }
    }

    // Public method to get the salary
    public double getSalary() {
        return salary;
    }
}

// Subclass
class Manager extends Employee {
    // Constructor
    public Manager(int employeeID, String department, double salary) {
        super(employeeID, department, salary);
    }

    // Method to display manager details
    public void displayManagerDetails() {
        System.out.println("Manager ID: " + employeeID);
        System.out.println("Department: " + department);
        System.out.println("Salary: " + getSalary());
    }
}

public class Main {
    public static void main(String[] args) {
        // Creating an Employee object
        Employee emp = new Employee(101, "HR", 50000);
        emp.setSalary(55000); // Modifying salary
        System.out.println("Employee Salary: " + emp.getSalary());

        // Creating a Manager object
        Manager mgr = new Manager(102, "Finance", 75000);
        mgr.displayManagerDetails();
    }
}
