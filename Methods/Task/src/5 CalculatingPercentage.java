import java.util.Scanner;

class CalculatingPercentage {
  static void main() {
    Scanner input = new Scanner(System.in);
    System.out.println("Enter two numbers :");
    int a = input.nextInt();
    int b = input.nextInt();

    System.out.println("Percentage is : " + percentage(a, b));
  }

  static float percentage(int a, int b) {
    return ((float) a / b) * 100;
  }
}
