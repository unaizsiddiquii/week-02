package com.ecommerceplatform;
//subclass
public class Groceries extends Product {
    private int discount;

    public Groceries(int productID, String name, int price, int taxRate, int discount) {
        super(productID, name, price, taxRate);
        this.discount = discount;
    }

    @Override
    protected int calculateDiscount() {
        return super.getPrice() * (discount / 100);
    }

    @Override
    public double calculateTax() {
        return super.getPrice() * (super.getTaxRate() / 100.0);
    }

    @Override
    public void getTaxDetails() {
        System.out.println("Tax: " + super.getTaxRate()+"%");
        System.out.println("Total Tax: " + calculateTax());
    }


    @Override
    void displayDetails() {
        System.out.println("Groceries--- ");
        super.displayDetails();
        System.out.println("Discount: " + discount);
        System.out.println("Tax: " + calculateTax());
        System.out.println("Final Price With Discount And Tax: " + finalPrice());
    }

    @Override
    double finalPrice() {
        return getPrice() - calculateDiscount() + calculateTax();
    }
}
