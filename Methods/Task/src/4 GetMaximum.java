import java.util.Scanner;

class GetMaximum {
  static void main() {
    Scanner input = new Scanner(System.in);
    System.out.println("Enter two numbers :");
    int a = input.nextInt();
    int b = input.nextInt();
    System.out.println("Maximum number is : " + getMaximum(a, b));
  }

  static int getMaximum(int a, int b) {
    return a > b ? a : b;
  }
}
