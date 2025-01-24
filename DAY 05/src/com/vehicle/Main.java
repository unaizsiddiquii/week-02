package com.vehicle;

public class Main {
    public static void main(String[] args) {
        Vehicle car = new Car(140, "Diesel", 5);
        Vehicle truck = new Truck(120, "Diesel", 600);
        Vehicle motercycle = new Motercycle(326, "Petrol", 410);


        Vehicle[] vehicles = {car, truck, motercycle};
        for (Vehicle vehicle : vehicles) {
            vehicle.displayInfo();
        }
    }
}
