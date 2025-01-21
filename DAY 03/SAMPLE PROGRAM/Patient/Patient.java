public class Patient {

  // static variables
  private static String hospitalName = "Indian Hospital";
  private static int totalPatients = 0;

  // instance variable
  private String name;
  private int age;
  private String ailment;

  private final int patientID;

  // constructor
  public Patient(String name, int age, String ailment, int patientID) {
    this.name = name;
    this.age = age;
    this.ailment = ailment;
    this.patientID = patientID;
    totalPatients++;
  }

  public void displayPatientDetail() {
    if (this instanceof Patient) {
      System.out.println("hospital Name :" + hospitalName);
      System.out.println("Patient Name :" + this.name);
      System.out.println("Patient age :" + this.age);
      System.out.println("Ailment :" + this.ailment);
      System.out.println("ID :" + this.patientID);
    } else {
      System.out.println("invalid patient object");
    }
  }

  // method to get the total patients count
  public static int getTotalPatients() {
    return totalPatients;
  }

  public static void main(String[] args) {
    Patient patient = new Patient("jack", 46, "viral", 340);
    Patient patient2 = new Patient("mark", 57, "back pain", 345);

    // display the detail of patient
    patient.displayPatientDetail();
    System.out.println();
    patient2.displayPatientDetail();

    System.out.println("\n");
    System.out.println("Total patients in the hospital is :" + getTotalPatients());

  }
}