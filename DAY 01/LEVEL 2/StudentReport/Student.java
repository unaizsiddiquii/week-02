//creating class student
public class Student {
  private String name;
  private int rollNumber;
  private double marks;

  //student class constructor
  public Student(String name, int rollNumber, double marks) {
    this.name = name;
    this.rollNumber = rollNumber;
    this.marks = marks;
  }

  //method to calculate Student grade
  private String calculateStudentGrade(double marks) {

    if (marks > 89) {
      return "A+";
    } else if (marks > 79) {
      return "A";
    } else if (marks > 69) {
      return "B";
    } else if (marks > 49) {
      return "C";
    } else if (marks > 31) {
      return "D";
    } else {
      return "F";
    }
  }
  //display the detail of student
  public void displayStudentReport() {
    System.out.println("\n---Student Report---\n");
    System.out.println("Name : " + this.name);
    System.out.println("Roll Number : " + this.rollNumber);
    System.out.println("Marks : " + this.marks);
    System.out.println("Grade : " + calculateStudentGrade(this.marks));

  }

  public static void main(String[] args) {

  //object of student class
    Student student = new Student("Unaiz Siddiqui", 101, 82);

    //method call to display student report
    student.displayStudentReport();
    Student student2 = new Student("Sardar Khan", 102, 30.2);
    student2.displayStudentReport();
  }
}
