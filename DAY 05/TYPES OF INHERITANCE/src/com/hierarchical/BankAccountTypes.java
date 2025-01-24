package com.hierarchical;

public class BankAccountTypes {
    public static void main(String[] args) {
        // SavingsAccount object
        SavingsAccount savings = new SavingsAccount(12345, 1000.0, 3.5);
        System.out.println("Savings Account Details:");
        savings.displayAccountType();


        System.out.println("\n-----------------------\n");

        // CheckingAccount object
        CheckingAccount checking = new CheckingAccount(78934, 2000.0, 500.0);
        System.out.println("Checking Account Details:");
        checking.displayAccountType();


        System.out.println("\n-----------------------\n");

        // FixedDepositAccount object
        FixedDepositAccount fixedDeposit = new FixedDepositAccount(98765, 5000.0);
        System.out.println("Fixed Deposit Account Details:");
        fixedDeposit.displayAccountType();

    }
}
