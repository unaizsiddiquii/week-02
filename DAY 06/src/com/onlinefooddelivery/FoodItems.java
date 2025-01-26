package com.onlinefooddelivery;

public abstract class FoodItems {

    private String itemName;
    private double price;
    private int quantity;

    //constructor
    public FoodItems(String itemName, Double price, int quantity) {
        this.itemName = itemName;
        this.price = price;
        this.quantity = quantity;
    }

    //sabstract method
    public abstract double calculateTotalPrice();

    public String getItemDetails() {
        return "\nItem Name: " + itemName + "\nPrice: " + price + "\nQuantity: " + quantity;
    }

    //Getter and Setter
    public double getPrice() {
        return price;
    }

    public int getQuantity() {
        return quantity;
    }
}
