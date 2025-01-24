package com.librarymanagementsystem;

//sub Class Author
public class Author extends Book {

    String name;
    String bio;

    //constructor
    public Author(String title, int publicationYear, String name, String bio) {
        super(title, publicationYear);
        this.name = name;
        this.bio = bio;
    }

    @Override
    void displayinfo() {
        //calling method of super class to display book details
        super.displayinfo();
        //details of author
        System.out.println("Author Name: " + this.name);
        System.out.println("Author Bio: " + this.bio);
        System.out.println();
    }
}
