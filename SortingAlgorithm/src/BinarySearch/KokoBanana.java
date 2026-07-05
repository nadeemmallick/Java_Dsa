package BinarySearch;

public class KokoBanana {
    public static void main(String[] arg) {
        int[] piles = {3, 6, 7, 11};
        int h = 8;
        System.out.println(kokoBanana(piles, h));

    }

    public static boolean isValid(int[] piles, int h, int mid) {
        long hours = 0;
        for (int i = 0; i < piles.length; i++) {
            hours += (piles[i] + mid - 1) / mid;
        }
        return hours <= h;

    }

    public static int kokoBanana(int[] piles, int h) {
        int n = piles.length;
        int start = 1;
        int maxLength = -1;
        for (int i = 0; i < n; i++) {
            if (piles[i] > maxLength)
                maxLength = piles[i];
        }
        int end = maxLength;
        int ans = -1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (isValid(piles, h, mid)) {
                ans = mid;
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return ans;


    }
}
