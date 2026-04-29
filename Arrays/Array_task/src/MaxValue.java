public class MaxValue {
  static void main() {
    int[] numbers = {23, 54, 2, 34, -65, 67};
    int n = numbers.length;
    int maxvalue = numbers[0];

    for (int i = 0; i <= n - 1; i++) {
      if (numbers[i] > maxvalue) {
        maxvalue = numbers[i];
      }
    }
    System.out.println(maxvalue);
  }
}
