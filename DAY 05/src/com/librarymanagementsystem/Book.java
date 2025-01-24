package com.librarymanagementsystem;

//super class Book
public class Book {
    String title;
    int publicationYear;
    

    //constructor of book class
    public Book(String title, int publicationYear) {
        this.title = title;
        this.publicationYear = publicationYear;

    }

    //method to display the details of books
    void displayinfo() {
        System.out.println("Title: " + title);
        System.out.println("Publish Year : " + publicationYear);

    }
}
