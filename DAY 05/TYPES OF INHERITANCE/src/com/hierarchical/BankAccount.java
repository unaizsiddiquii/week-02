package com.hierarchical;

//super class
public class BankAccount {
    int accountNumber;
    double balance;

    //constructor
    public BankAccount(int accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    //method to display account type
    void displayAccountType() {
        System.out.println("AccountType : Checking Account");
    }

}
