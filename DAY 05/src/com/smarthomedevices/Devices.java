package com.smarthomedevices;

public class Devices {
    int deviceId;
    String status;

    public Devices(int deviceId, String status) {
        this.deviceId = deviceId;
        this.status = status;
    }

    void displayStatus() {
        System.out.println("Device ID: " + this.deviceId);
        System.out.println("Device Status: " + this.status);
    }

}
