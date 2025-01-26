package com.ecommerceplatform;
//super abstract class implements with Taxable
public abstract class Product implements Taxable {

    //private properties
    private int productID;
    private String name;
    private int price;
    private int taxRate;

    //constructor
    public Product(int productID, String name, int price, int taxRate) {
        this.productID = productID;
        this.name = name;
        this.price = price;
        this.taxRate = taxRate;
    }

    //Getter and Setter
    public int getProductID() {
        return productID;
    }

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }

    public int getTaxRate() {
        return taxRate;
    }

    void displayDetails() {
        System.out.println("Product ID: " + productID);
        System.out.println("Product Name: " + name);
        System.out.println("Product Price: " + price);

    }

//    abstract method for final price
    abstract double finalPrice();

    //abstract method for discount calculating
    protected abstract int calculateDiscount();

}
