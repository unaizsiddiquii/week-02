class Book {
  private String title;
  private String author;
  private double price;
  private boolean isAvailable;

  // Constructor to initialize book details
  public Book(String title, String author, double price, boolean isAvailable) {
    this.title = title;
    this.author = author;
    this.price = price;
    this.isAvailable = isAvailable;
  }

  // Method to display book details
  public void displayDetails() {
    System.out.println("Title: " + title);
    System.out.println("Author: " + author);
    System.out.println("Price: $" + price);
    System.out.println("Availability: " + (isAvailable ? "Available" : "Not Available"));
  }

  // Method to borrow a book
  public void borrowBook() {
    if (isAvailable) {
      System.out.println("You have successfully borrowed \"" + title + "\".");
      isAvailable = false;
    } else {
      System.out.println("Sorry, \"" + title + "\" is currently not available.");
    }
  }

  public static void main(String[] args) {
    // Create a book
    Book book1 = new Book("The Great Gatsby", "F. Scott Fitzgerald", 15.99, true);

    // Display book details
    book1.displayDetails();

    // Borrow the book
    System.out.println("\nAttempting to borrow the book...");
    book1.borrowBook();

    // Try borrowing the book again
    System.out.println("\nAttempting to borrow the book again...");
    book1.borrowBook();

    // Display updated details
    System.out.println("\nUpdated Book Details:");
    book1.displayDetails();
  }
}
