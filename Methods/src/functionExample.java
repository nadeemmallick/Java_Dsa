public class functionExample {
  public static void main(String[] args) {
      System.out.println("Table of 2");
    printTable(); // calling the function
  }

  public static void printTable() {
    for (int i = 1; i <= 10; i++) {
      System.out.println(2 * i);
    }
  }
}
