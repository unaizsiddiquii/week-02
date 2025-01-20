// Base class: Student
class Student {
  public int rollNumber; // Public: Accessible from anywhere
  protected String name; // Protected: Accessible within the same package and by subclasses
  private double CGPA; // Private: Accessible only within the class

  // Constructor
  public Student(int rollNumber, String name, double CGPA) {
    this.rollNumber = rollNumber;
    this.name = name;
    this.CGPA = CGPA;
  }

  // Public method to access CGPA
  public double getCGPA() {
    return CGPA;
  }

  // Public method to modify CGPA
  public void setCGPA(double CGPA) {
    this.CGPA = CGPA;
  }
}

// Subclass: PostgraduateStudent
class PostgraduateStudent extends Student {

  // Constructor for PostgraduateStudent
  public PostgraduateStudent(int rollNumber, String name, double CGPA) {
    super(rollNumber, name, CGPA); // Calling the constructor of the parent class
  }

  // Method to demonstrate the use of protected members
  public void displayPostgraduateDetails() {
    System.out.println("Roll Number: " + rollNumber); // Accessing public member
    System.out.println("Name: " + name); // Accessing protected member
    System.out.println("CGPA: " + getCGPA()); // Accessing private member via public method
  }
}

// Main class to test the implementation
public class UniversityManagementSystem {
  public static void main(String[] args) {
    // Creating an instance of PostgraduateStudent
    PostgraduateStudent pgStudent = new PostgraduateStudent(101, "John Doe", 8.75);

    // Accessing and modifying CGPA using public methods
    System.out.println("Original CGPA: " + pgStudent.getCGPA());
    pgStudent.setCGPA(9.2);
    System.out.println("Updated CGPA: " + pgStudent.getCGPA());

    // Displaying details of the postgraduate student
    pgStudent.displayPostgraduateDetails();
  }
}
