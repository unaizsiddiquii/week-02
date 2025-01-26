package com.ridehailingapplication;

//subclass
public class Bike extends Vehicle implements GPS {
    private String location;

    //constructor
    public Bike(int vehicleId, String driverName, int ratePerKm, String location) {
        super(vehicleId, driverName, ratePerKm, "Bike");
        this.location = location;
    }

    //method to get current location
    @Override
    public String getCurrentLocation() {
        return location;
    }

    //method to update location
    @Override
    public void updateLocation(String location) {
        this.location = location;
    }

    //method to calculate fare
    @Override
    public double calculateFare(double distance) {
        return distance * getRatePerKm();
    }
}
