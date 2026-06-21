package Arrays;

class MaximumSubarray {
  // Brute Force approach with O(n^2)
  public static int maxSubArray(int[] nums) {
    int n = nums.length;
    // to store the minimum value possible
    int max_sum = Integer.MIN_VALUE;
    for (int i = 0; i < n; i++) {
      // i jaise he start ho raha sum hm zero krr de rahe hai mens reset
      int sum = 0;
      for (int j = i; j < n; j++) {
        sum += nums[j];
        // check agar maxsum bada hai ya sum agar sum bada hai to maxisum se replace krr de rahe hai
        max_sum = Math.max(max_sum, sum);
      }
    }
    return max_sum;
  }

  // Kadane's Algorithm with O(n)' optimal solution
  public static int maxSubArray1(int[] nums) {
    int n = nums.length;
    int max_sum = Integer.MIN_VALUE;
    int sum = 0;
    for (int i = 0; i < n; i++) {
      // sum mai add karna hai
      sum = sum + nums[i];
      // max_sum mai update or replace with lagre value
      max_sum = Math.max(max_sum, sum);
      // if sum is less than 0 reset it with 0
      if (sum < 0) {
        sum = 0;
      }
    }
    return max_sum;
  }

  public static void main(String[] args) {
    int[] nums = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
    System.out.println(maxSubArray1(nums));
    System.out.println(maxSubArray(nums));
  }
}
