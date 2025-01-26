package com.patientmanagement;

import java.util.ArrayList;
import java.util.List;

class OutPatient extends Patient implements MedicalRecord {
    private double consultationFee;
    private double medicineCost;
    private List<String> medicalHistory = new ArrayList<>();

    // Constructor
    public OutPatient(String patientId, String name, int age, String diagnosis, double consultationFee, double medicineCost) {
        super(patientId, name, age, diagnosis);
        this.consultationFee = consultationFee;
        this.medicineCost = medicineCost;
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
        return consultationFee + medicineCost;
    }
}
