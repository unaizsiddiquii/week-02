package com.vehiclerentalsystem;

//subclass of vehicle
public class Car extends Vehicle implements Insurable {
    private final String insurancePolicyNumber;

    //constructor
    public Car(String vehicleNumber, int rentalRate, String insurancePolicyNumber) {
        super(vehicleNumber, "Car", rentalRate);
        this.insurancePolicyNumber = insurancePolicyNumber;
    }

    //override method to calculate rental cost
    @Override
    public int calculateRentalCost(int days) {
        return super.getRentalRate() * days;
    }

    //override from insurable interface
    @Override
    public double calculateInsurance() {
        return super.getRentalRate() * 0.15;

    }

    //override from insurable interface
    @Override
    public String getInsuranceDetails() {
        return "Insurance Policy Number : " + insurancePolicyNumber;
    }
}
