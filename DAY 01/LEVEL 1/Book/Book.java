package Book;

//create class with Book class name
public class Book {

    public String author;
    public String title;
    public double price;

    //constructor to initialize instance
    public Book(String author, String title, Double price) {
        this.author = author;
        this.title = title;
        this.price = price;
    }

    //method to print book details
    public void bookDetails() {
        System.out.println("\nBOOK DETAILS----\n");
        System.out.println("Author : " + author);
        System.out.println("Title : " + author);
        System.out.println("Price : " + author);
    }

    public static void main(String[] args) {

        //object of the class
        Book book = new Book("J. R. R. Tolkien", "The Lord of the Rings", 599.0);

        //calling method with object variable
        book.bookDetails();
        Book book2 = new Book(" by J.K. Rowling", "Harry Potter Series", 649.0);
        book2.bookDetails();
    }
}
