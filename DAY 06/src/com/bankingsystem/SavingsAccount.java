package com.bankingsystem;

public class SavingsAccount extends BankAccount implements Loanable {
    private boolean isLoanApplied = false;
    private double interestRate = 0.03;

    public SavingsAccount(String accountNumber, String holderName, int balance) {
        super(accountNumber, holderName, balance);
    }

    @Override
    public double calculateInterest() {
        //3% annual interest rate
        return getBalance() * interestRate;
    }

    @Override
    public void applyForLoan() {
        this.isLoanApplied = true;
        System.out.println("Your loan has been applied!\n");

    }

    @Override
    public String calculateLoanEligibility() {
        return isLoanApplied ? "--Not eligible for loan because you already apply for loan!" : "--Eligible for loan ";

    }
}
