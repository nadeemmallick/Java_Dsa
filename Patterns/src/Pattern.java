public class Pattern {
  static void main() {
    int n = 6;

    for (int row = 1; row <= n; row++) {
      // part1
      for (int col = 1; col <= row; col++) {
        System.out.print("* ");
      }
      // part 2
      for (int col = 1; col <= 2 * (n - row); col++) {
        System.out.print("  ");
      }
      // part3
      for (int col = 1; col <= row; col++) {
        System.out.print("* ");
      }

      System.out.println();
    }
    // Part for inverted triangle

      for(int row =1; row<=n; row++){
          //part 4
          for(int col =1; col<=n-row+1; col++){
          System.out.print("* ");
          }
          //part 5
          for(int col =1; col<=2*row-2; col++){
          System.out.print("  ");
          }
          //part 6
          for(int col =1; col<=n-row+1; col++){
              System.out.print("* ");
          }
          System.out.println();
      }
  }
}
