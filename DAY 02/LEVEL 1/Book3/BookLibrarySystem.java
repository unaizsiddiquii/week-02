
// Base class: Book
class Book {
  public String ISBN;
  protected String title;
  private String author;

  // Constructor for Book
  public Book(String ISBN, String title, String author) {
    this.ISBN = ISBN;
    this.title = title;
    this.author = author;
  }

  // Get and set the author name
  public String getAuthor() {
    return author;
  }

  public void setAuthor(String author) {
    this.author = author;
  }
}

// Subclass: EBook
class EBook extends Book {

  // Constructor for EBook
  public EBook(String ISBN, String title, String author) {
    super(ISBN, title, author);
  }

  // Display book details
  public void displayEBookDetails() {
    System.out.println("ISBN: " + ISBN);
    System.out.println("Title: " + title);
    System.out.println("Author: " + getAuthor());
  }
}

// Main class
public class BookLibrarySystem {
  public static void main(String[] args) {
    // Creating an instance of EBook
    EBook eBook = new EBook("978-3-16-148410-0", "Java Programming", "John Smith");

    // Displaying details of the ebook
    eBook.displayEBookDetails();

    // Modifying the author name
    System.out.println("Original Author: " + eBook.getAuthor());
    eBook.setAuthor("Jane Doe");
    System.out.println("Updated Author: " + eBook.getAuthor());
  }
}
