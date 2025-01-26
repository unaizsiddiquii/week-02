package com.librarymanagementsystem;

//subclass and implement interface
public class DVD extends LibraryItem implements Reservable {
    private boolean isAvailable = true;
    private String borrower;

    //constructor
    public DVD(String itemId, String title, String author) {
        super(itemId, title, author);
    }

    //override from superclass to get loan duration
    @Override
    public int getLoanDuration() {
        return 3;
    }

    //override from interface to reserved the DVD
    @Override
    public void reserveItem(String borrower) {
        if (isAvailable) {
            this.borrower = borrower;
            isAvailable = false;
            System.out.println("DVD is Reserved for:" + borrower);
        } else {
            System.out.println("DVD is Not available.");
        }

    }

    //method to check availability of the product
    @Override
    public boolean checkAvailability() {
        return isAvailable;
    }
}
