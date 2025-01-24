package com.hierarchical;

//subclass
public class FixedDepositAccount extends BankAccount {

    //constructor
    public FixedDepositAccount(int accountNumber, double balance) {
        super(accountNumber, balance);
    }

    @Override
    void displayAccountType() {
        System.out.println("AccountType : Fixed Deposit Account");
    }
}
