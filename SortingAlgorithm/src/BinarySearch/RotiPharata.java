package BinarySearch;

public class RotiPharata {
    public static void main(String[] args) {
        int[] cook = {1, 2, 3, 4};
        int n = 4;
        int p = 10;
        RotiPharata obj = new RotiPharata();
        System.out.println(obj.min_time_roti(p, cook, n));
    }

    public int min_time_roti(int p, int[] cook, int n) {
        // p = number of pharata to cook
        // n = number of cooks
        int size = cook.length;
        int start = 0;
        int maxRank = -1;

        for (int i = 0; i < size; i++) {
            if (cook[i] > maxRank) {
                maxRank = cook[i];
            }
        }
        int end = maxRank * (p * (p + 1) / 2);
        int ans = -1;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (isValid(p, cook, n, mid)) {
                ans = mid;
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }


        return ans;
    }

    public boolean isValid(int p, int[] cook, int n, int time) {
        int paratasCount = 0;
        for (int i = 0; i < cook.length; i++) {
            int currentRank = cook[i];
            int timeTaken = 0;
            int j = 1;
            while (timeTaken <= time) {
                if (timeTaken + j * currentRank <= time) {
                    timeTaken += j * currentRank;
                    paratasCount++;
                    j++;
                } else {
                    break;
                }
            }
        }
        if (paratasCount >= p) {
            return true;
        } else {
            return false;
        }
    }
}

