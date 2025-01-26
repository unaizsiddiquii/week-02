package com.librarymanagementsystem;

//subclass and implement interface
public class Book extends LibraryItem implements Reservable {
    private boolean isAvailable = true;
    private String borrower;

    //constructor
    public Book(String itemId, String title, String author) {
        super(itemId, title, author);
    }
    //override from superclass to get loan duration

    @Override
    public int getLoanDuration() {
        return 10;
    }

    //override from interface to reserved the Book
    @Override
    public void reserveItem(String borrower) {
        if (isAvailable) {
            this.borrower = borrower;
            isAvailable = false;
            System.out.println("Book is Reserved for:" + borrower);
        } else {
            System.out.println("Book is Not available.");
        }

    }

    //method to check availability of the product
    @Override
    public boolean checkAvailability() {
        return isAvailable;
    }
}
