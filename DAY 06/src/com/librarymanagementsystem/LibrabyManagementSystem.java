package com.librarymanagementsystem;

//main class
public class LibrabyManagementSystem {
    public static void main(String[] args) {

        // Polymorphism: Managing all items through LibraryItem reference
        LibraryItem book = new Book("B001", "The Great Gatsby", "F. Scott Fitzgerald");
        LibraryItem magazine = new Magazine("M001", "National Geographic", "Various Authors");
        LibraryItem dvd = new DVD("D001", "Inception", "Christopher Nolan");

        System.out.println(book.getItemDetails());
        System.out.println("Loan Duration: " + book.getLoanDuration() + " days");

        System.out.println(magazine.getItemDetails());
        System.out.println("Loan Duration: " + magazine.getLoanDuration() + " days");

        System.out.println(dvd.getItemDetails());
        System.out.println("Loan Duration: " + dvd.getLoanDuration() + " days");

        // Reservable functionality
        Reservable reservableBook = (Reservable) book;
        reservableBook.reserveItem("John Doe");
        System.out.println("Book Available: " + reservableBook.checkAvailability());
        reservableBook.reserveItem("unaiz");
    }
}
