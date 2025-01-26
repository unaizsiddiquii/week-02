package com.librarymanagementsystem;

public interface Reservable {
    void reserveItem(String borrower);

    boolean checkAvailability();
}
