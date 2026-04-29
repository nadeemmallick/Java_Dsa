import java.util.Scanner;

public class InputArray {
  static void main() {
    Scanner sc = new Scanner(System.in);

    int[] marks = new int[5];
    int n = marks.length;
    System.out.println("Enter the marks of 5 subjects :");
    for (int i = 0; i <= n - 1; i++) {
      System.out.println("Enter marks of subject " + i + ":");
      marks[i] = sc.nextInt();
    }

    for (int value : marks) {
      System.out.println(value);
    }
  }
}
