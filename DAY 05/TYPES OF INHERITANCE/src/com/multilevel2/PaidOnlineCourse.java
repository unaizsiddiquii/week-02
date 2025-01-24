package com.multilevel2;

public class PaidOnlineCourse extends OnlineCourse {
    double fee;
    double discount;

    public PaidOnlineCourse(String courseName, int duration, String platform, boolean isRecorded, double fee, double discount) {
        super(courseName, duration, platform, isRecorded);
        this.fee = fee;
        this.discount = discount;
    }

    @Override
    void courseDetails() {
        super.courseDetails();
        System.out.println("Fee : " + fee);
        System.out.println("Discount : " + discount);
        System.out.println("Total Fee : " + calculateDiscount());
    }

    double calculateDiscount() {
        return this.fee - (this.fee * this.discount / 100);
    }
}
