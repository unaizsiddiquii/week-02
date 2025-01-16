public class CartItem {

  private String itemName;
  private double price;
  private int quantity;

  // constructor
  public CartItem(String itemName, double price) {

    this.itemName = itemName;
    this.price = price;

  }

  // method to add item
  public void additem(int quantity) {
    this.quantity += quantity;
    System.out.println("Item added");
  }

  // method to remove item
  public void removeitem(int quantity) {
    this.quantity -= quantity;
    System.out.println("Item remove");
  }

  // method to display the total cost of cart
  public void TotalCost() {

    double totalCost = this.quantity * this.price;

    System.out.println("Item in the cart : " + this.itemName);
    System.out.println("Quantity of item in the cart : " + this.quantity);
    System.out.println("Total cost of cart is : " + totalCost);
  }

  public static void main(String[] args) {
    CartItem item1 = new CartItem("Biscuit", 10);

    // item added
    item1.additem(5);

    // display total cost
    item1.TotalCost();

    // item remove
    item1.removeitem(2);

    // display total cost
    item1.TotalCost();
  }
}
