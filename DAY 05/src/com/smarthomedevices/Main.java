package com.smarthomedevices;

public class Main {
    public static void main(String[] args) {
        Thermostat thermostat = new Thermostat(121, "ON", 34);
        thermostat.displayStatus();
    }
}
