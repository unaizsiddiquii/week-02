public class Vehicle {
  private String ownerName;
  private String vehicleType;
  private static double registrationFee = 100.0;

  public Vehicle(String ownerName, String vehicleType) {
    this.ownerName = ownerName;
    this.vehicleType = vehicleType;
  }

  public void displayVehicleDetails() {
    System.out.println("Owner Name: " + ownerName);
    System.out.println("Vehicle Type: " + vehicleType);
    System.out.println("Registration Fee: $" + registrationFee);
  }

  public static void updateRegistrationFee(double newFee) {
    registrationFee = newFee;
  }

  public static void main(String[] args) {
    Vehicle.updateRegistrationFee(150.0);

    Vehicle vehicle1 = new Vehicle("Alice", "Car");
    Vehicle vehicle2 = new Vehicle("Bob", "Motorcycle");

    vehicle1.displayVehicleDetails();
    System.out.println();
    vehicle2.displayVehicleDetails();
  }
}
