package com.hybrid2;

// Subclass: ElectricVehicle
class ElectricVehicle extends Vehicle {
    int batteryCapacity; // in kWh

    // Constructor for ElectricVehicle
    public ElectricVehicle(String model, int maxSpeed, int batteryCapacity) {
        super(model, maxSpeed); // Call to superclass constructor
        this.batteryCapacity = batteryCapacity;
    }

    // Method to charge the electric vehicle
    public void charge() {
        System.out.println("Charging the electric vehicle with a battery capacity of " + batteryCapacity + " kWh.");
    }

    // Override displayDetails to include battery capacity
    @Override
    public void displayDetails() {
        super.displayDetails(); // Call superclass method
        System.out.println("Battery Capacity: " + batteryCapacity + " kWh");
    }
}