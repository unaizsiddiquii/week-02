package com.hybrid2;

public class VehicleManagementSystem {
    public static void main(String[] args) {
        // Create an ElectricVehicle object
        ElectricVehicle ev = new ElectricVehicle("Tesla Model S", 250, 100);
        System.out.println("Electric Vehicle Details:");
        ev.displayDetails();
        ev.charge();

        System.out.println("\n-----------------------\n");

        // Create a PetrolVehicle object
        PetrolVehicle pv = new PetrolVehicle("Ford Mustang", 300, 60);
        System.out.println("Petrol Vehicle Details:");
        pv.displayDetails();
        pv.refuel();
    }
}

