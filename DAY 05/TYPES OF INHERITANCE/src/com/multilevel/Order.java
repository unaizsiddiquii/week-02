package com.multilevel;

//super class
public class Order {

    int orderId;
    String orderDate;

    //constructor
    public Order(int orderId, String orderDate) {
        this.orderId = orderId;
        this.orderDate = orderDate;
    }

    //method to display order current status
    String getOrderStatus() {
        return "Order Placed--";
    }

    //method to display order information
    void orderInfo() {
        System.out.println("Order ID: " + this.orderId);
        System.out.println("Order Date: " + this.orderDate);
    }

}
