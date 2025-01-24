package com.vehicle;

public class Motercycle extends Vehicle {
    int bikeCC;

    public Motercycle(int maxSpeed, String fuelType, int bikeCC) {
        super(maxSpeed, fuelType);
        this.bikeCC = bikeCC;
    }

    @Override
    void displayInfo() {
        System.out.println("Bike");
        super.displayInfo();
        System.out.println("Bike CC: " + this.bikeCC);
        System.out.println();
    }
}
