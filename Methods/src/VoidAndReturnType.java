public class VoidAndReturnType {
  public static void main(String[] args) {
    int a = 10;
    int b = 30;
    print(a, b);
    System.out.println(sum(a, b));
  }

  //    return type
  public static int sum(int a, int b) {
    int Addition = a + b;
    return Addition;
  }

  //    void return type
  public static void print(int a, int b) {
    System.out.println(a - b);
  }
}
