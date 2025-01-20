
// Base class: BankAccount
class BankAccount {
  public String accountNumber;
  protected String accountHolder;
  private double balance;

  // Constructor for BankAccount
  public BankAccount(String accountNumber, String accountHolder, double balance) {
    this.accountNumber = accountNumber;
    this.accountHolder = accountHolder;
    this.balance = balance;
  }

  // Public methods to access and modify balance
  public double getBalance() {
    return balance;
  }

  public void setBalance(double balance) {
    this.balance = balance;
  }
}

// Subclass: SavingsAccount
class SavingsAccount extends BankAccount {

  // Constructor for SavingsAccount
  public SavingsAccount(String accountNumber, String accountHolder, double balance) {
    super(accountNumber, accountHolder, balance);
  }

  // Method to display account details
  public void displayAccountDetails() {
    System.out.println("Account Number: " + accountNumber); // Accessing public member
    System.out.println("Account Holder: " + accountHolder); // Accessing protected member
    System.out.println("Balance: " + getBalance()); // Accessing private member via public method
  }
}

// Main class
public class BankAccountManagement {
  public static void main(String[] args) {
    // Creating an instance of SavingsAccount
    SavingsAccount savingsAccount = new SavingsAccount("123456789", "Alice Johnson", 5000.75);

    // Displaying account details
    savingsAccount.displayAccountDetails();

    // Accessing and modifying balance using public methods
    System.out.println("Original Balance: " + savingsAccount.getBalance());
    savingsAccount.setBalance(6000.50);
    System.out.println("Updated Balance: " + savingsAccount.getBalance());
  }
}
