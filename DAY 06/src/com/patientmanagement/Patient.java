package com.patientmanagement;

import java.awt.geom.Arc2D;

//abstract class
public abstract class Patient {
    private String patientID;
    private String name;
    private int age;
    private String diagnosis;

    //constructor
    public Patient(String patientID, String name, int age, String diagnosis) {
        this.patientID = patientID;
        this.name = name;
        this.age = age;
        this.diagnosis = diagnosis;
    }

    //abstract method
    public abstract Double calculateBill();

    //method to get the Patient Details
    public void getPatientDetails() {
        System.out.println("Patient ID: " + patientID);
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Diagnosis: " + diagnosis);
        System.out.println();
    }

    //Getter
    public String getPatientID() {
        return patientID;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}
