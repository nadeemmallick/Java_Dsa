public class Partionequal416 {
    public static void main(String[] args) {
        int[] nums = {1,5,11,5};
        boolean ans = partion(nums);
        System.out.println(ans);


    }
    public static boolean partion(int[] nums){
        int sum = 0;
        for(int num : nums){
            sum += num;
        }
        if((sum & 1) == 1){
            return false;
        }
        int index = 0;
        int target = sum/2;

        boolean ans = solve(target,nums,index);
        return ans;
    }
    public static boolean solve(int target, int[] nums, int index){
       //base call
        if(target == 0){
            return true;
        }
        //base call
        if(target < 0){
            return false;
        }
        //base call
        if(index >= nums.length){
            return false;
        }

        boolean include = solve(target - nums[index],nums,index+1);
        boolean exclude = solve(target ,nums,index+1);

        return include || exclude;
    }
}
