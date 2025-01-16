//create BankAccount class
class BankAccount {
    //bankAccount class variable
    private String accountHolder;
    private int accountNumber;
    private double balance;

    //bankAccount Variable
    public BankAccount(String accountHolder, int accountNumber, double balance) {
        this.accountHolder = accountHolder;
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    //method to deposit money
    public void depositMoney(double money) {
        System.out.println("Deposite Balance : " + this.balance);
        this.balance += money;
        System.out.println("Current Balance : " + this.balance);
    }

    //method to withdraw money
    public void withdrawMoney(double money) {
        System.out.println("Withdrawing Balance : " + money);
        if (this.balance >= money) {
            this.balance -= money;
            System.out.println("Current Balance : " + this.balance);
        } else {
            System.out.println("Insufficient balance : " + this.balance);
        }
    }

    //method to display the account details
    public void displayCurrentBalance() {
        System.out.println("Account Holder : " + this.accountHolder);
        System.out.println("Account Number : " + this.accountNumber);
        System.out.println("Current Balance : " + this.balance);
    }
}

public class ATM {
    public static void main(String[] args) {

        //object of bank account
        BankAccount bankAccount = new BankAccount("Khushi Siddiqui", 626540726, 1222989);
        //method calling to display current balance
        bankAccount.displayCurrentBalance();
        //withdraw
        bankAccount.withdrawMoney(120000);
        //deposit
        bankAccount.depositMoney(12345);

    }
}
