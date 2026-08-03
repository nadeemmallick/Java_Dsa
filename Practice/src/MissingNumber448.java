import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class MissingNumber448 {
    public static void main(String[] args) {
        int[] nums = {4, 3, 2, 7, 8, 2, 3, 1};
        MissingNumber448 m = new MissingNumber448();
        System.out.println(m.findDisappearedNumbersBrute(nums));
        System.out.println(m.findDisappearedNumbersBest(nums));
        System.out.println(m.findDisappearedNumbersOptimal(nums));
    }

    //Brute Force approch
    public List<Integer> findDisappearedNumbersBrute(int[] nums) {
        int n = nums.length;
        List<Integer> ans = new ArrayList<>();

        for (int i = 1; i <= n; i++) {
            boolean flag = false;
            for (int num : nums) {
                if (num == i) {
                    flag = true;
                    break;
                }
            }
            if (!flag) {
                ans.add(i);
            }
        }
        return ans;
    }

    //Best Approch
    public List<Integer> findDisappearedNumbersBest(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        List<Integer> ans = new ArrayList<>();

        for (int num : nums) {
            set.add(num);
        }
        for (int i = 1; i <= nums.length; i++) {
            if (!set.contains(i)) {
                ans.add(i);
            }
        }
        return ans;
    }

    //Optimal Approch
    public List<Integer> findDisappearedNumbersOptimal(int[] nums) {
        int n = nums.length;
        List<Integer> ans = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            int value = Math.abs(nums[i]);
            int position = value - 1;
            if (nums[position] > 0) {
                nums[position] = -nums[position];
            }
        }

        for (int i = 0; i < n; i++) {
            if (nums[i] > 0) {
                ans.add(i + 1);
            }
        }
        return ans;
    }


}
