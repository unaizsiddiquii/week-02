package com.patientmanagement;

import java.util.ArrayList;
import java.util.List;

//subclass
class InPatient extends Patient implements MedicalRecord {
    private double roomCharges;
    private int daysAdmitted;
    private double treatmentCost;
    private List<String> medicalHistory = new ArrayList<>();

    // Constructor
    public InPatient(String patientId, String name, int age, String diagnosis, double roomCharges, int daysAdmitted, double treatmentCost) {
        super(patientId, name, age, diagnosis);
        this.roomCharges = roomCharges;
        this.daysAdmitted = daysAdmitted;
        this.treatmentCost = treatmentCost;
    }

    @Override
    public void addRecord(String record) {
        medicalHistory.add(record);
    }

    @Override
    public List<String> viewRecords() {
        return medicalHistory;
    }

    @Override
    public Double calculateBill() {
        return (daysAdmitted * treatmentCost) + roomCharges;
    }
}
