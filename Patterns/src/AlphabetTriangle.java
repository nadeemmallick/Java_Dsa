public class AlphabetTriangle {
    static void main() {
        int n = 4;

        for (int row = 1; row <= n; row++) {

            for (int col = 1; col <= row; col++) {
                System.out.print(" " + (char) ('A' + col - 1));
            }
            System.out.println();
        }
    }

}
