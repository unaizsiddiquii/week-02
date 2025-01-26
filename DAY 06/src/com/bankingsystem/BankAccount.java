package com.bankingsystem;

//super abstract class
public abstract class BankAccount {
    private final String accountNumber;
    private final String holderName;
    private double balance;

    public BankAccount(String accountNumber, String holderName, int balance) {
        this.accountNumber = accountNumber;
        this.holderName = holderName;
        this.balance = balance;
    }

    //method to deposit amount
    public void deposit(double amount) {
        if (amount > 0) {
            this.balance += amount;
            System.out.println("Deposit Ammount:" + amount + "\nCurrent balance: " + this.balance);
        } else {
            System.out.println("Invalid deposit amount");
        }
    }

    //method to withdraw amount
    public void withdraw(double amount) {

        if (amount > 0 && this.balance >= amount) {
            this.balance -= amount;
            System.out.println("Withdraw Ammount:" + amount + "\nCurrent balance: " + this.balance);

        } else {
            System.out.println("Insufficient Balance to Withdraw");
        }
    }

    public void accountDetails() {
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Holder Name: " + holderName);
        System.out.println("Current Balance: " + balance);
        System.out.println("\n");
    }

    //abstract method for calculating interest in child class
    public abstract double calculateInterest();

    //Getter and Setter
    public String getAccountNumber() {
        return accountNumber;
    }

    public String getHolderName() {
        return holderName;
    }

    public double getBalance() {
        return balance;
    }
}
