import java.util.Scanner;

public class PalindromeChecker {
  private String string;

  // constructor
  public PalindromeChecker(String string) {
    this.string = string;
  }

  // this method check palindrome text
  public void checkPalindrome() {
    boolean isPalindrome = false;
    String copyString = "";
    for (int i = 0; i <= this.string.length() / 2; i++) {
      char ch = string.charAt(i);
      if (ch == string.charAt(string.length() - i - 1)) {

        isPalindrome = true;
        continue;
      }
      isPalindrome = false;
    }
    displayString(isPalindrome);

  }

  // this method display palindrome result and text
  private void displayString(boolean isPalindrome) {

    if (isPalindrome) {
      System.out.println(this.string + " - text is palindrome.");

    } else {
      System.out.println(this.string + " - text is not palindrome.");

    }

  }

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    // geting user input
    System.out.print("Enter a text: ");
    String string = scanner.next();

    // object
    PalindromeChecker palindromeChecker = new PalindromeChecker(string);
    // method call toc heck and display palindrome text
    palindromeChecker.checkPalindrome();

  }
}