package Arrays;

class PivotIndex {
    // Time Complexity: O(n^2)  brute force approach
    public static int pivotIndex(int[] nums) {
        int n = nums.length;

        for(int i = 0; i<n; i++){
            int leftSum = 0;
            int rightSum = 0;
            for(int j = 0; j<i; j++){
                leftSum += nums[j];
            }
            for(int k = i+1; k<n; k++){
                rightSum += nums[k];
            }
            if(leftSum == rightSum){
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] nums = {1,7,3,6,5,6};
        System.out.println(pivotIndex(nums));
    }
}
