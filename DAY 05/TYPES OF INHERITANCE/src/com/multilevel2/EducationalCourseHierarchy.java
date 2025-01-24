package com.multilevel2;

public class EducationalCourseHierarchy {
    public static void main(String[] args) {

        //course class object
        Course course = new Course("Introduction to JAVA", 6);
        System.out.println("Course Details----");
        course.courseDetails();
        System.out.println();

        //onlineCourse object
        OnlineCourse onlineCourse = new OnlineCourse("Web Development Bootcamp", 8, "Udemy", true);
        System.out.println("Online Course Details:");
        onlineCourse.courseDetails();
        System.out.println();

        //PaidOnlineCourse object
        PaidOnlineCourse paidCourse = new PaidOnlineCourse("Advanced Java Programming", 10, "Coursera", true, 500.0, 20.0);
        System.out.println("Paid Online Course Details:");
        paidCourse.courseDetails();

    }
}
