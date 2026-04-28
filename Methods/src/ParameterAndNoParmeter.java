public class ParameterAndNoParmeter {
  public static void main(String[] args) {
    int a = 10;
    int b = 20;
    sum(a, b);
    multiplication();
  }

  // function with parameter
  public static void sum(int a, int b) {
    int sum = a + b;
    System.out.println(sum);
  }

  // function without parameter
  public static void multiplication() {
    int x = 2;
    int y = 3;
    int product = x * y;
    System.out.println(product);
  }
}
