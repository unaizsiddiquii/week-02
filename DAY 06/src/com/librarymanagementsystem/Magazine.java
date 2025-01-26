package com.librarymanagementsystem;

public class Magazine extends LibraryItem implements Reservable {
    private boolean isAvailable = true;
    private String borrower;

    public Magazine(String itemId, String title, String author) {
        super(itemId, title, author);
    }

    //override from superclass to get loan duration
    @Override
    public int getLoanDuration() {
        return 7;
    }

    //override from interface to reserved the magazine
    @Override
    public void reserveItem(String borrower) {
        if (isAvailable) {
            this.borrower = borrower;
            isAvailable = false;
            System.out.println("Magazine is Reserved for:" + borrower);
        } else {
            System.out.println("Magazine is Not available.");
        }

    }

    //method to check availability of the product
    @Override
    public boolean checkAvailability() {
        return isAvailable;
    }
}
