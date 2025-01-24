package com.hybrid2;

// Subclass: PetrolVehicle
class PetrolVehicle extends Vehicle implements Refuelable {
    int fuelTankCapacity; // in liters

    // Constructor for PetrolVehicle
    public PetrolVehicle(String model, int maxSpeed, int fuelTankCapacity) {
        super(model, maxSpeed); // Call to superclass constructor
        this.fuelTankCapacity = fuelTankCapacity;
    }

    // Implement refuel method from Refuelable interface
    @Override
    public void refuel() {
        System.out.println("Refueling the petrol vehicle with a tank capacity of " + fuelTankCapacity + " liters.");
    }

    // Override displayDetails to include fuel tank capacity
    @Override
    public void displayDetails() {
        super.displayDetails(); // Call superclass method
        System.out.println("Fuel Tank Capacity: " + fuelTankCapacity + " liters");
    }
}