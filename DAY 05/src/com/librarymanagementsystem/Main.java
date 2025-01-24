package com.librarymanagementsystem;

public class Main {
    public static void main(String[] args) {
        Book book1 = new Author(
                "To Kill a Mockingbird",
                1960,
                "Harper Lee",
                "Harper Lee was an American novelist widely known for 'To Kill a Mockingbird'."
        );
        Book book2 = new Author(
                "The Great Gatsby",
                1925,
                "F. Scott Fitzgerald",
                "American novelist and short-story writer, widely regarded as one of the greatest authors of the 20th century. His works often explore themes of wealth, love, and the American Dream."
        );

        book1.displayinfo();
        book2.displayinfo();


    }
}
