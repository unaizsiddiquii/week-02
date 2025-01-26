package com.ridehailingapplication;

public abstract class Vehicle {
    private final int vehicleId;
    private String driverName;
    private int ratePerKm;
    private String vehicleType;

    //constructor
    public Vehicle(int vehicleId, String driverName, int ratePerKm, String vehicleType) {
        this.vehicleId = vehicleId;
        this.driverName = driverName;
        this.ratePerKm = ratePerKm;
        this.vehicleType = vehicleType;

    }

    //abstract method to calculate fare
    public abstract double calculateFare(double distance);

    //display vehicle Details
    public String getVehicleDetails() {
        return "Vehicle ID: " + vehicleId + "\nDriver Name: " + driverName + "\nVehicle Type: " + vehicleType + "\nRate per Km: " + ratePerKm;

    }

    //getter
    public int getRatePerKm() {
        return ratePerKm;
    }
}
