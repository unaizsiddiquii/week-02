package com.multilevel2;

//super class
public class Course {
    String courseName;
    int duration;

    //constructor for course
    public Course(String courseName, int duration) {
        this.courseName = courseName;
        this.duration = duration;
    }

    //display course details
    void courseDetails() {
        System.out.println("Course Name: " + this.courseName);
        System.out.println("Duration: " + this.duration + " weeks");
    }


}
