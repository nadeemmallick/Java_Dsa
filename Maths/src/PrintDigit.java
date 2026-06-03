public class PrintDigit {
  static void main() {
    int num = 5343567;
    printDigit(num);
  }

  public static void printDigit(int num) {
    while (num != 0) {
      int digit = num % 10;
      System.out.println(digit);
      num = num / 10;
    }
  }
}
