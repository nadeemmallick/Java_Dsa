public class houseRobbery198 {
    public static void main(String[] args) {
        int[] nums = {2,7,9,3,1};
        System.out.println(rob(nums));

    }

    public static int solve(int[] nums, int index) {
        if (index >= nums.length) {
            return 0;
        }

        //rob
        int rob = nums[index] + solve(nums, index + 2);

        //skip
        int skip = 0 + solve(nums, index + 1);

        return Math.max(rob, skip);
    }
    public static int rob(int[] nums){
        int index = 0;
        int ans = solve(nums, index);
        return ans;
    }
}
