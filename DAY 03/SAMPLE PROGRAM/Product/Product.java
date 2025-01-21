public class Product {

  // static variable of discount(same for all object)
  private static double discount = 10.0;

  // instance variable
  private String productName;
  private Double price;
  private int quantity;

  // constructor to initialize the instance variable
  public Product(String productName, Double price, int quantity) {
    this.productName = productName;
    this.price = price;
    this.quantity = quantity;
  }

  // method to display the bill(product details)
  public void displayBill() {
    if (this instanceof Product) {
      System.out.println("Product Name : " + this.productName);
      System.out.println("Price : " + this.price);
      System.out.println("Quantity : " + this.quantity);
      System.out.println("Discount : " + discount);
      System.out.println("Total price : " + this.totalPrice());
    } else {
      System.out.println("Invalid object!");
    }
  }

  private double totalPrice() {
    double discountedPrice = this.price - (this.price * (discount / 100));
    return discountedPrice * this.quantity;
  }

  // static method to update dicount that change for whole class
  public static void updateDiscount(int newdiscount) {
    discount = newdiscount;
  }

  public static void main(String[] args) {

    // object of Product class
    Product product1 = new Product("Headphones", 5000.0, 2);
    product1.displayBill();

  }
}