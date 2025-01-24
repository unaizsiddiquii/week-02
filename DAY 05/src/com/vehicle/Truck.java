package com.vehicle;

public class Truck extends Vehicle {
    int loadCapacity;

    public Truck(int maxSpeed, String fuelType, int loadCapacity) {
        super(maxSpeed, fuelType);
        this.loadCapacity = loadCapacity;
    }

    @Override
    void displayInfo() {
        System.out.println("Truck");
        super.displayInfo();
        System.out.println("Load capacity: " + this.loadCapacity +" /kg");
        System.out.println();
    }
}
