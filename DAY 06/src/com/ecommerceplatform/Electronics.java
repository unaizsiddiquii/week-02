package com.ecommerceplatform;
//subclass
public class Electronics extends Product {
    private int discount;

    public Electronics(int productID, String name, int price, int taxRate, int discount) {
        super(productID, name, price, taxRate);
        this.discount = discount;
    }

    //method to calculate discount
    @Override
    protected int calculateDiscount() {
        return super.getPrice() * (discount / 100);
    }

    //calculate tax
    @Override
    public double calculateTax() {
        return super.getPrice() * (super.getTaxRate() / 100.0);
    }

    //display tax details
    @Override
    public void getTaxDetails() {
        System.out.println("Tax: " + super.getTaxRate() + "%");
        System.out.println("Total Tax: " + calculateTax());
    }

    //display details
    @Override
    void displayDetails() {
        System.out.println("Electronics---: ");
        super.displayDetails();
        System.out.println("Discount: " + discount);
        System.out.println("Final Price With Discount And Tax: " + finalPrice());
    }

    @Override
    double finalPrice() {
        return getPrice() - calculateDiscount() + calculateTax();
    }
}
