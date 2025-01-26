package com.onlinefooddelivery;

//subclass
public class NonVegItem extends FoodItems implements Discountable {
    private boolean isDiscountApplied = false;
    private final double discount = 0.10;
    private double totalPrice;
    private double extraCharges = 50;

    //constructor
    public NonVegItem(String itemName, Double price, int quantity) {
        super(itemName, price, quantity);
    }

    //method to apply dicount
    @Override
    public void applyDiscount() {
        isDiscountApplied = true;
        System.out.println("Discount applied! on veg item");

    }

    //method to get thediscount details
    @Override
    public String getDiscountDetails() {
        return isDiscountApplied ? "Discount: " + getPrice() * discount : "10% Discount not applied";
    }

    //calculate the total price
    @Override
    public double calculateTotalPrice() {

        totalPrice = isDiscountApplied ? ((getPrice() * getQuantity()) - ((getPrice() * getQuantity()) * discount)) : getPrice() * getQuantity();
        System.out.print("Extra Charges: " + extraCharges);
        totalPrice += extraCharges;
        return totalPrice;
    }
}
