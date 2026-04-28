class MethodOverlodingWithINTandString {
  static void main() {
    System.out.println(sum(10, 20));
    System.out.println(sum("Nadeem", "Mallick"));
  }

  static int sum(int a, int b) {
    return a + b;
  }

  static String sum(String a, String b) {
    return a + b;
  }
}
