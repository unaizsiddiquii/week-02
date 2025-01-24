package com.hierarchical;

//subclass
public class CheckingAccount extends BankAccount {
    double withdrawalLimit;

    //constructor
    public CheckingAccount(int accountNumber, double balance, double withdrawalLimit) {
        super(accountNumber, balance);
        this.withdrawalLimit = withdrawalLimit;
    }

    @Override
    void displayAccountType() {
        System.out.println("AccountType : Checking Account");
    }
}
