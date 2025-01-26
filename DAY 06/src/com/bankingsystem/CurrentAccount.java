package com.bankingsystem;

//subclass of Bankaccount class
public class CurrentAccount extends BankAccount implements Loanable {
    private boolean isLoanApplied = false;
    private double interestRate = 0.01;

    public CurrentAccount(String accountNumber, String holderName, int balance) {
        super(accountNumber, holderName, balance);
    }

    @Override
    public double calculateInterest() {
        //1% annual interest rate
        return getBalance() * interestRate;
    }

    @Override
    public void applyForLoan() {
        if (isLoanApplied == false) {
            this.isLoanApplied = true;
            System.out.println("Your loan has been applied!");
        } else {
            System.out.println("You are already applied for loan");
        }
    }

    @Override
    public String calculateLoanEligibility() {
        return isLoanApplied ? "--Not eligible for loan because you already apply for loan!" : "--Eligible for loan ";
    }
}
