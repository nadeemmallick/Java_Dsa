import java.util.Scanner;

public class Palindrome {
  static void main() {
    Scanner input = new Scanner(System.in);
    System.out.println("enter a number :");
    int num = input.nextInt();
    boolean ans = isPalindrome(num);
    System.out.println(ans);
  }

  public static boolean isPalindrome(int num) {
    int reversed = 0;
    while (num != 0) {
      int digit = num % 10;
      reversed = reversed * 10 + digit;
      num = num / 10;

      if (reversed == num) {
        return true;
      }
    }
    return false;
  }
}
