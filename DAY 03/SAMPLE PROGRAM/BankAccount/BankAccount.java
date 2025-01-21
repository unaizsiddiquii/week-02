public class BankAccount {

  // Static variables shared with class
  private static String bankName = "Bank of India";
  private static int totalAccount;

  // non-static variables
  private String accountHolderName;

  // variable with final value
  private final int accountNumber;

  // costructor to initialize instance variable
  public BankAccount(String accountHolderName, int accountNumber) {
    this.accountHolderName = accountHolderName;
    this.accountNumber = accountNumber;
    totalAccount++;

  }

  // method to display Account Details
  public void displayDetails() {

    // instanceof to check the current object is the instance of current class
    if (this instanceof BankAccount) {
      System.out.println("Bank Name : " + bankName);
      System.out.println("Account Holder name : " + getAccountHolderName());
      System.out.println("Account Number name : " + getAccountNumber());
      System.out.println();
    } else {
      System.out.println("Invalid account Object! ");
    }

  }

  // To get the account number, Total Amount count, Account holder name

  public static int getTotalAccount() {
    return totalAccount;
  }

  public int getAccountNumber() {
    return accountNumber;
  }

  public String getAccountHolderName() {
    return accountHolderName;
  }

  public static void main(String[] args) {

    // object of bank class
    BankAccount bankAccount1 = new BankAccount("Khushi Siddiqui", 1234567);
    BankAccount bankAccount2 = new BankAccount("Rehan Siddiqui", 1234987);

    // to display the details of account
    bankAccount1.displayDetails();
    bankAccount2.displayDetails();

    // to display total account in the bank
    System.out.println("Total account: " + getTotalAccount());

  }
}