package com.bankingsystem;

import java.util.ArrayList;
import java.util.List;

public class BankingSystem {
    public static void main(String[] args) {

        //object
        BankAccount savingsAccount = new SavingsAccount("SAVE22321", "Khushi Siddiqui", 800);

        //displaying the result
        savingsAccount.accountDetails();
        savingsAccount.withdraw(500);
        savingsAccount.accountDetails();
        savingsAccount.calculateInterest();
        ((Loanable) savingsAccount).applyForLoan();
        ((Loanable) savingsAccount).calculateLoanEligibility();


        BankAccount currentAccount = new SavingsAccount("CURR22321", "Asand Khan", 12590);
        currentAccount.withdraw(1100);
        currentAccount.calculateInterest();
        currentAccount.deposit(200);
        currentAccount.accountDetails();

        ((Loanable) savingsAccount).calculateLoanEligibility();


    }
}
