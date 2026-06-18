package Arrays;

class Twosum {
  public int[] twoSum(int[] nums, int target) {

    int n = nums.length;

    for (int i = 0; i < n - 1; i++) {
      for (int j = i + 1; j < n; j++) {

        if (nums[i] + nums[j] == target) {
          int[] ans = {i, j};
          return ans;
        }
      }
    }
    int[] ans = {};
    return ans;
  }

    public static void main(String[] args) {
        int[] arr = {2,7,11,15};
        int target = 13;
        Twosum obj = new Twosum();
        int[] ans = obj.twoSum(arr, target);
        for (int j : ans) {
            System.out.print(j + " ");
        }
    }
}
