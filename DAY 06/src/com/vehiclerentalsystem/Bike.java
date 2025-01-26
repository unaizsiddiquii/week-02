package com.vehiclerentalsystem;

//subclass of vehicle
public class Bike extends Vehicle implements Insurable {
    private final String insurancePolicyNumber;

    public Bike(String vehicleNumber, int rentalRate, String insurancePolicyNumber) {
        super(vehicleNumber, "Bike", rentalRate);
        this.insurancePolicyNumber = insurancePolicyNumber;

    }

    //calculate rental cost
    @Override
    public int calculateRentalCost(int days) {
        return super.getRentalRate() * days;
    }

    //calculate insurance
    @Override
    public double calculateInsurance() {
        return super.getRentalRate() * 0.10;

    }

    //to get insurance details
    @Override
    public String getInsuranceDetails() {
        return "Insurance Policy Number : " + insurancePolicyNumber;
    }
}
