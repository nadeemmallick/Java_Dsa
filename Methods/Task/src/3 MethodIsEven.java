import java.util.Scanner;

class MethodIsEven {
  static void main() {
    Scanner input = new Scanner(System.in);
    System.out.println("Enter a number :");
    int num = input.nextInt();
    if (isEven(num) == true) {
      System.out.println("Number is Even");
    } else {
      System.out.println("Number is Odd");
    }
  }

  public static boolean isEven(int num) {
    return num % 2 == 0;
  }
}
