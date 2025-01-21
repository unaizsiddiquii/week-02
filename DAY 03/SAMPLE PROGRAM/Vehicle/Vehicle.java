public class Vehicle {

  // static variables
  private static int registrationFee = 500;

  // instance variable
  private String ownerName;
  private String vehicleType;
  private final int registrationNumber;

  // constructor
  public Vehicle(String ownerName, String vehicleType, int registrationNumber) {
    this.ownerName = ownerName;
    this.vehicleType = vehicleType;
    this.registrationNumber = registrationNumber;

  }

  public void vehicleDetails() {
    if (this instanceof Vehicle) {
      System.out.println("Owner name: " + this.ownerName);
      System.out.println("Vehical Type: " + this.vehicleType);
      System.out.println("Registration Number: " + this.registrationNumber);
      System.out.println("Regisration fee: " + registrationFee);
      System.out.println();
    } else {
      System.out.println("invalid! object");
    }
  }

  // updating registration fee
  public static void updateRegistrationFee(int newRegistrationFee) {

    registrationFee = newRegistrationFee;
  }

  public static void main(String[] args) {
    Vehicle vehicle = new Vehicle("Khushi Siddiqui", "SUV", 2607);
    vehicle.vehicleDetails();
    updateRegistrationFee(700);

    System.out.println(registrationFee);

  }
}