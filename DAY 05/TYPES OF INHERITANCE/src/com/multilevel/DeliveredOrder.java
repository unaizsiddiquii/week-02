package com.multilevel;
//subclass of DeliveredOrder class

public class DeliveredOrder extends ShippedOrder {
    String dateDeliveryDate;

    //constructor
    public DeliveredOrder(int orderId, String orderDate, int trackingNumber, String dateDeliveryDate) {
        super(orderId, orderDate, trackingNumber);
        this.dateDeliveryDate = dateDeliveryDate;
    }

    //Delivered order status
    @Override
    String getOrderStatus() {
        return "Order Delivery on : " + dateDeliveryDate;
    }

    //Delivered order info
    @Override
    void orderInfo() {
        super.orderInfo();
        System.out.println("Delivery Date: " + dateDeliveryDate);
    }
}
