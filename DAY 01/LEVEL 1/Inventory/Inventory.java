package Inventory;

//creating class
public class Inventory {
  //instance variable
  private int itemCode;
  private String itemName;
  private double price;

  //constructor
  public Inventory(int itemCode, String itemName, double price) {
    this.itemCode = itemCode;
    this.itemName = itemName;
    this.price = price;
  }

  //method to display the items
  public void displayItem() {
    System.out.println("\nItem Details---\n");
    System.out.println("Item Code : " + itemCode);
    System.out.println("Item Code : " + itemName);
    System.out.println("Item Code : " + price);
    System.out.println("Total Cost : " + totalCost(price, itemCode));
  }

  private double totalCost(Double price, int itemCode) {
    return price * itemCode;
  }

  public static void main(String[] args) {

    //object of inventory class
    Inventory inventory = new Inventory(4, "Mobile", 22449);
    inventory.displayItem();
    Inventory inventory1 = new Inventory(10, "Headphones", 599);
    inventory.displayItem();
  }
}
