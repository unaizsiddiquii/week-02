package com.vehiclerentalsystem;
//super class
public abstract class Vehicle {
    private final String vehicleNumber;
    private final String type;
    private final int rentalRate;

    //constructor
    public Vehicle(String vehicleNumber, String type, int rentalRate) {
        this.vehicleNumber = vehicleNumber;
        this.type = type;
        this.rentalRate = rentalRate;
    }

    //abstract method to calculate rental rate
    public abstract int calculateRentalCost(int days);

    //Display vehicle details
    public void displayDetails() {
        System.out.println("Vehicle Number: " + vehicleNumber);
        System.out.println("Type: " + type);
        System.out.println("Rental Rate: " + rentalRate);
    }

    //Getter
    public int getRentalRate() {
        return rentalRate;

    }
}
