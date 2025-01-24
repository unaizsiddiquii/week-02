package com.multilevel;
//subclass of order

public class ShippedOrder extends Order {
    int trackingNumber;

    //constructor
    public ShippedOrder(int orderId, String orderDate, int trackingNumber) {
        super(orderId, orderDate);
        this.trackingNumber = trackingNumber;
    }

    //Shipped order status
    @Override
    String getOrderStatus() {
        return "Order Shipped. Tracking number : " + trackingNumber;
    }

    //override method to display info
    @Override
    void orderInfo() {
        super.orderInfo();
        System.out.println("Tracking: " + trackingNumber);
    }
}
