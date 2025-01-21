public class Student {

  // static variable to shareacross the class
  private static String universityName = "Indian University";
  private static int totalSutudent = 0;

  // instace variable
  private String name;
  private final int rollNumber;
  private char grade;

  // constructor of student class to initialize instance
  public Student(String name, int rollNumber, char grade) {
    this.name = name;
    this.rollNumber = rollNumber;
    this.grade = grade;
    totalSutudent++;

  }

  // method to display the student details
  public void displayStudentDetail() {

    // checking the object is valid or not
    if (this instanceof Student) {
      System.out.println("University name : " + universityName);
      System.out.println("Student name: " + this.name);
      System.out.println("Student Roll number: " + this.rollNumber);
      System.out.println("Student grade: " + this.grade);
      System.out.println();
    } else {

      System.out.println("Student object is invalid!");

    }
  }

  // display the total student
  public static void displayTotalSutudent() {

    System.out.println("\nTotal umber of student is : " + totalSutudent);

  }

  public static void main(String[] args) {

    // object of student class
    Student student = new Student("Unaiz", 201, 'B');
    Student student1 = new Student("Khushi", 202, 'A');

    // displaying student details
    student.displayStudentDetail();
    student1.displayStudentDetail();

    // displaing total student
    displayTotalSutudent();
  }
}