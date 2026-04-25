public class BreakLooping {
    static void main() {
        for (int i = 1; i <= 10; i++) {
            if (i == 5) {
                break; // break krte hai loop ko
            }
            System.out.println(i);
        }
    }
}
