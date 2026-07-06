package BinarySearch;

public class non_duplicate {
    public static void main(String[] args) {
        int [] nums = {10,10,20,20,30,40,40};
        System.out.println(nonDuplicate(nums));

    }
    public static int nonDuplicate(int[] nums){

        int n = nums.length;

        for(int i=0; i<n; i+=2){
            if(nums[i] != nums[i+1] ){
                return nums[i];
            }
        }
        return nums[n-1];

    }
}
