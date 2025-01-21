public class Book {
  // staic method to share with all class object
  private static String libraryName = "Indian Library";

  // instance variable
  private String title;
  private String author;
  private final int isbn;

  // constructor
  public Book(String title, String author, int isbn) {
    this.title = title;
    this.author = author;
    this.isbn = isbn;
  }

  // to display library name

  public static String displayLibraryName() {
    return libraryName;
  }

  // method to display book details
  public void displayDetails() {
    if (this instanceof Book) {
      System.out.println("Library Name : " + displayLibraryName());
      System.out.println("Title : " + title);
      System.out.println("Author : " + author);
      System.out.println();
    } else {
      System.out.println("Invalid Book");
    }
  }

  public static void main(String[] args) {
    // object of Book class
    Book b1 = new Book("The Tell-Tale Heart", "Edgar Allan Poe", 4356784);
    b1.displayDetails();
  }
}