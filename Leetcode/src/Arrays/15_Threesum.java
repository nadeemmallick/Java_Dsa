package Arrays;

import java.util.*;

class Threesum {
    public List<List<Integer>> threeSum(int[] nums, int target) {
    Set<List<Integer>> set = new HashSet<>();
    int n = nums.length;
    for (int i = 0; i < n - 2; i++) {
      for (int j = i + 1; j < n - 1; j++) {
        for (int k = j + 1; k < n; k++) {
          if (nums[i] + nums[j] + nums[k] == target) {
            List<Integer> temp = new ArrayList<>();
            temp.add(nums[i]);
            temp.add(nums[j]);
            temp.add(nums[k]);
            Collections.sort(temp);
            set.add(temp);
          }
        }
      }
    }
    return new ArrayList<>(set);
  }

  public static void main(String[] args) {
    int[] arr = {-1, 0, 1, 2, -1, -4};
    int target = 0;
    Threesum obj = new Threesum();
    List<List<Integer>> ans = obj.threeSum(arr, target);
    for (List<Integer> j : ans) {
      System.out.print(j + " ");
    }
  }
}
