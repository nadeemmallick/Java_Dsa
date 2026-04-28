public class MethodOverloding {
  public static void main(String[] args) {
    System.out.println(Addition(10, 20));
    System.out.println(Addition(10, 20, 30));
  }

  // method with two parameter
  public static int Addition(int a, int b) {
    return a + b;
  }

  // method with three parameter
  public static int Addition(int a, int b, int c) {
    return a + b + c;
  }
}
