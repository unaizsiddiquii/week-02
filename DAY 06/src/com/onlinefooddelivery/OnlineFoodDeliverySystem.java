package com.onlinefooddelivery;

import java.util.ArrayList;
import java.util.List;

public class OnlineFoodDeliverySystem {
    public static void main(String[] args) {
        //create list of object
        List<FoodItems> foodItemsList = new ArrayList<FoodItems>();

        //object
        FoodItems vegItem = new VegItem("Paneer Butter Masala", 30.50, 10);
        foodItemsList.add(vegItem);
        FoodItems nonVegItem = new VegItem("Chicken Biryani", 300.50, 1);
        foodItemsList.add(nonVegItem);

        //displaing the result
        for (FoodItems foodItem : foodItemsList) {
            System.out.println(foodItem.getItemDetails());
            System.out.println("Total price: " + foodItem.calculateTotalPrice());

            Discountable discountable = (Discountable) foodItem;
            System.out.println("Discount: " + discountable.getDiscountDetails());
            discountable.applyDiscount();
            System.out.println("Total price with Discount: " + foodItem.calculateTotalPrice());
            System.out.println("\n--------------");
        }


    }
}
