package Revision;

class TwoSum {
    public static void main(String[] args) {
        int[] nums = {2, 7, 11, 15};
        int target = 9;
//        int[] result = twoSum(nums, target);
//        for (int i = 0; i < result.length; i++) {
//            System.out.print(result[i]);
//
        int[] result = twoSum1(nums, target);
        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i]);
        }


    }
    public static int[] twoSum1(int[] nums, int target) {
        int n = nums.length;
        int left = 0;
        int right = n-1;
        while(left < right){
            int sum = nums[left] + nums[right];
            if(sum == target){
                return new int[]{left,right};
            }else if(sum < target){
                left++;
            }else{
                right--;
            }
        }
        return null;
    }
    public static int[] twoSum(int[] nums, int target) {
        int n =  nums.length;
//        int[] ans = new int[n];
        for(int i = 0; i < n-1; i++){
            for(int j = i+1; j < n; j++){
                if(nums[i] + nums[j] == target){
                    int[] ans = {i ,j};
                    return ans;
                }

            }
        }
        return null;
    }
}
