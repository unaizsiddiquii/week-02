package com.ridehailingapplication;


public class RideHailingApplication {
    public static void main(String[] args) {

        //object
        Vehicle car = new Car(123, "Alice", 15, "Kamla nagar");
        Vehicle bike = new Bike(456, "Bob", 10, "Kamla nagar");
        Vehicle auto = new Auto(789, "Charlie", 12, "Kamla nagar");

        //calculating fare of 10 km
        System.out.println("Fare for 10 km: " + car.calculateFare(10));

        bike.getVehicleDetails();
        System.out.println("Fare for 10 km: " + bike.calculateFare(10));

        auto.getVehicleDetails();
        System.out.println("Fare for 10 km: " + auto.calculateFare(10));

        //Displaying the location
        GPS carGPS = (GPS) car;
        System.out.println("Current location: " + carGPS.getCurrentLocation());
        carGPS.updateLocation("Indrapuri");
        System.out.println("Current location is updated: " + carGPS.getCurrentLocation());


    }
}
