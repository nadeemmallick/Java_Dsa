public class SolidDiamond {
    public static void main(String[] args) {
        int n = 8;
        int mid = (n + 1) / 2;

        // Upper half
        for (int row = 1; row <= mid; row++) {
            for (int col = 1; col <= mid - row; col++) {
                System.out.print("  ");
            }
            for (int col = 1; col <= 2 * row - 1; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }

        // Lower half
        for (int row = mid - 1; row >= 1; row--) {
            for (int col = 1; col <= mid - row; col++) {
                System.out.print("  ");
            }
            for (int col = 1; col <= 2 * row - 1; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
