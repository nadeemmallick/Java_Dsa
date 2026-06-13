package BitWiseQuestions;

import java.util.Scanner;

public class odd_even {
  static void main() {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter a number :");
    int n = sc.nextInt();
    if ((n & 1) == 0) {
      System.out.println("Even");

    } else {
      System.out.println("Odd");
    }
    }
}
