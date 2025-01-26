package com.vehiclerentalsystem;

import java.util.ArrayList;
import java.util.List;

public class VehileRentalSystem {
    public static void main(String[] args) {

        //creat list of object
        List<Vehicle> vehicleList = new ArrayList<Vehicle>();
        vehicleList.add(new Car("C123", 1500, "CAR12345"));
        vehicleList.add(new Bike("B456", 500, "BIKE67890"));
        vehicleList.add(new Truck("T789", 3000, "TRUCK11223"));
        vehicleList.add(new Truck("T764", 3100, "TRUCK11456"));

        //displaying details of rental vehicle
        for (Vehicle vehicle : vehicleList) {
            vehicle.displayDetails();
            System.out.println("Rental cost for 5 days: "+vehicle.calculateRentalCost(5));

            //displaying insurance details
            Insurable insurable = (Insurable) vehicle;
            System.out.println(insurable.getInsuranceDetails());
            System.out.println("Insurance Cost: "+insurable.calculateInsurance());
            System.out.println("\n----------");

        }
    }
}
