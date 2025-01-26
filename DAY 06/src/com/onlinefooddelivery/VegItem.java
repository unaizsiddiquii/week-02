package com.onlinefooddelivery;

//subclass
public class VegItem extends FoodItems implements Discountable {
    private boolean isDiscountApplied = false;
    private final double discount = 0.10;
    private double totalPrice;

    //constructor
    public VegItem(String itemName, Double price, int quantity) {
        super(itemName, price, quantity);
    }

    //apply discount
    @Override
    public void applyDiscount() {
        isDiscountApplied = true;
        System.out.println("Discount applied! on veg item");

    }

    //method to get discount
    @Override
    public String getDiscountDetails() {
        return isDiscountApplied ? "Discount: " + getPrice() * discount : "10% Discount not applied";
    }

    //method to calculate total price
    @Override
    public double calculateTotalPrice() {

        totalPrice = isDiscountApplied ? ((getPrice() * getQuantity()) - ((getPrice() * getQuantity()) * discount)) : getPrice() * getQuantity();
        return totalPrice;
    }
}
