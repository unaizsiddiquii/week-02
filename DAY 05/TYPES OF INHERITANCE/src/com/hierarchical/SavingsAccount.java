package com.hierarchical;

//subclass
public class SavingsAccount extends BankAccount {
    double interestRate;

    //constructor
    public SavingsAccount(int accountNumber, double balance, double interestRate) {
        super(accountNumber, balance);
        this.interestRate = interestRate;
    }

    @Override
    void displayAccountType() {
        System.out.println("AccountType : Saving Account");
    }
}
