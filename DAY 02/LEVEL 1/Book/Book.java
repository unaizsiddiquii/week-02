
public class Book {

  private String title;
  private String author;
  private String price;

  public Book(String title, String author, String price) {
    this.title = title;
    this.author = author;
    this.price = price;
  }

  // method to display
  public void bookDetails() {
    System.out.println("\nBOOK DETAILS----\n");
    System.out.println("Author : " + author);
    System.out.println("Title : " + title);
    System.out.println("Price : " + price);
  }

  public static void main(String[] args) {
    // object of the class
    Book book = new Book("J. R. R. Tolkien", "The Lord of the Rings", "599.0");
    // calling method with object variable
    book.bookDetails();
    Book book2 = new Book(" by J.K. Rowling", "Harry Potter Series", "649.0");
    book2.bookDetails();

  }
}
