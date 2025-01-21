public class Employee {

  // static variable
  private static String companyName = "Capgemini";
  private static int totalEmployee = 0;

  // instance variable and final for id (id of employee can't change)
  private final int id;
  private String name;
  private String designation;

  // constructor
  public Employee(int id, String name, String designation) {
    this.id = id;
    this.name = name;
    this.designation = designation;
    totalEmployee++;
  }

  // method for displaying employee Details
  public void displayEmployeeDetails() {
    if (this instanceof Employee) {

      System.out.println("Name of the Company : " + companyName);
      System.out.println("ID : " + this.id);
      System.out.println("Name : " + this.name);
      System.out.println("Designation : " + this.designation);

    } else {
      System.out.println("Invalid employee object");
    }
  }

  // method for displaying total number of employee
  public static void displyeTotalEmployees() {
    System.out.println("\nTotal employee in the company is: " + totalEmployee);

  }

  public static void main(String[] args) {

    // object of Employee class
    Employee em1 = new Employee(101, "Unaiz", "Software Developer");

    Employee em2 = new Employee(102, "Rehan", "Software Tester");

    // em1 details
    em1.displayEmployeeDetails();
    System.out.println();
    // em2 details
    em2.displayEmployeeDetails();

    // total employee
    displyeTotalEmployees();

  }
}
