package com.ecommerceplatform;
//main class
import java.util.ArrayList;
import java.util.List;

public class ECommercePlatform {
    public static void main(String[] args) {

        //list to store object
        List<Product> productList = new ArrayList<Product>(0);
        Product electronics = new Electronics(101, "Fan", 2999, 5, 10);
        productList.add(electronics);
        Product clothing = new Clothing(104, "T-Shirt", 549, 3, 10);
        productList.add(clothing);
        Product groceries = new Groceries(124, "Sugar", 42, 5, 4);
        productList.add(groceries);

        //invoke all object
        for (Product product : productList) {
            product.displayDetails();
            System.out.println("Tax Details: ");
            product.getTaxDetails();
            System.out.println("\n-----------");
        }


    }
}
