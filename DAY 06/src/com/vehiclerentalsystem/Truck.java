package com.vehiclerentalsystem;

//subclass of vehicle
public class Truck extends Vehicle implements Insurable {
    private final String insurancePolicyNumber;

    public Truck(String vehicleNumber, int rentalRate, String insurancePolicyNumber) {
        super(vehicleNumber, "Truck", rentalRate);
        this.insurancePolicyNumber = insurancePolicyNumber;

    }

    //calculate rental cost
    @Override
    public int calculateRentalCost(int days) {
        return super.getRentalRate() * days;
    }

    //calculate insurance cost
    @Override
    public double calculateInsurance() {
        return super.getRentalRate() * 0.20;
    }

    //get insurance details
    @Override
    public String getInsuranceDetails() {
        return "Insurance Policy Number : " + insurancePolicyNumber;
    }
}
