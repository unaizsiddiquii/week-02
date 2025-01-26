package com.librarymanagementsystem;

//Abstract class
public abstract class LibraryItem {
    private String itemId;
    private String title;
    private String author;

    // Constructor
    public LibraryItem(String itemId, String title, String author) {
        this.itemId = itemId;
        this.title = title;
        this.author = author;
    }

    //abstract method to get duration of item from child class
    public abstract int getLoanDuration();

    //display item details
    public String getItemDetails() {
        return "Item ID: " + itemId + "\nTitle: " + title + "\nAuthor: " + author;
    }
}
