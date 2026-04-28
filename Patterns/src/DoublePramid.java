public class DoublePramid {
  static void main() {
    int n = 4;
    // part 1
    for (int row = 1; row <= n; row++) {
      // space

      for (int col = 1; col <= row - 1; col++) {
        System.out.print("  ");
      }
      // star
      for (int col = 1; col <= 2 * (n - row) + 1; col++) {
        System.out.print("* ");
      }
      System.out.println();
    }
    // part2

    for (int row = 1; row <= n; row++) {
      // space
      if (row == 1) {
        continue;
      } else {
        for (int col = 1; col <= n - row; col++) {
          System.out.print("  ");
        }
        // star
        for (int col = 1; col <= 2 * row - 1; col++) {
          System.out.print("* ");
        }
      }

      System.out.println();
    }
  }
}
