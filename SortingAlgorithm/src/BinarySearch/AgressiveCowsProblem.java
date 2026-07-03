package BinarySearch;

import java.util.Arrays;

public class AgressiveCowsProblem {
    public static int AgressiveCows(int[] nums, int k) {
        Arrays.sort(nums);
        int n = nums.length;
        int start = 0;
        int end = nums[n - 1] - nums[0];
        int ans = -1;

        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (Isvalid(nums, k, mid)) {
                ans = mid;
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return ans;
    }

    public static boolean Isvalid(int[] nums, int k, int mid) {
        int cowsCount = 1;
        int last_position = 0;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] - nums[last_position] >= mid) {
                cowsCount++;
                last_position = i;
                if (cowsCount == k) {
                    return true;
                }
            }
        }
        return false;
    }
    public static void main(String[] args) {
        int[] nums = new int[]{1,2,8,4,9};
        int k = 3;
        System.out.println(AgressiveCows(nums, k));
    }
}
