package Arrays;
//Given a sorted array of distinct integers and a target value, return the index if the target is found.
// If not, return the index where it would be if it were inserted in order.
//You must write an algorithm with O(log n) runtime complexity.
//Example 1:
//Input: nums = [1,3,5,6], target = 5
//Output: 2
//Example 2:
//Input: nums = [1,3,5,6], target = 2
//Output: 1

class searchingPosition {
    public static int searchIntegers(int[] nums, int target) {
        int n = nums.length;
        for(int i = 0; i< n; i++){
            if(nums[i] >= target){
                return i;
            }
        }
        return nums.length;
    }
    public static void main(String[] args) {
        int[] nums = {2,3,4,5,6,7,8,9};
        System.out.println(searchIntegers(nums,1));


    }
}
