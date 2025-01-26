package com.patientmanagement;

import java.util.List;

public class HospitalPatientManagement {


    // Method to process patients and display details
    public static void processPatient(Patient patient) {
        System.out.println("\n--- Patient Details ---");
        patient.getPatientDetails();
        System.out.println("Total Bill: " + patient.calculateBill());

        if (patient instanceof MedicalRecord) {
            MedicalRecord record = (MedicalRecord) patient;
            System.out.println("\n--- Medical Records ---");
            record.viewRecords().forEach(System.out::println);
        }
    }

    public static void main(String[] args) {
        // Create InPatient and OutPatient objects
        InPatient inPatient = new InPatient("P001", "John Doe", 45, "Fracture", 2000.0, 5, 10000.0);
        OutPatient outPatient = new OutPatient("P002", "Jane Smith", 30, "Flu", 500.0, 2000.0);

        // Add medical records
        inPatient.addRecord("Admitted on: 2025-01-20");
        inPatient.addRecord("Surgery performed: 2025-01-21");
        outPatient.addRecord("Visited on: 2025-01-22");
        outPatient.addRecord("Prescribed antibiotics for 7 days");

        processPatient(inPatient);
        processPatient(outPatient);

    }
}
