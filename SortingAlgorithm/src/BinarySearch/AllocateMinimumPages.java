package BinarySearch;

public class AllocateMinimumPages {
    public static boolean IsValid(int[] nums, int k, int mid){
        int studentCount = 1;
        int pages = 0;
        for(int i = 0; i<nums.length; i++){
            if(pages + nums[i] <= mid){
                pages = pages + nums[i];
            }else {
                studentCount++;
                if(studentCount > k || nums[i] > mid){
                    return false;
                }else{
                    pages = 0;
                    pages = pages + nums[i];
                }
            }
        }
        return true;
    }
    public static int allocateMinimumPages(int[] nums, int k){
        int n = nums.length;
        int start = 0;
        int sum = 0;
        for (int num : nums) {
            sum = sum + num;
        }
        int end = sum;
        int ans = -1;
        while(start <= end){
            int mid = start + (end-start)/2;
            if(IsValid(nums,k,mid)){
                ans = mid;
                end = mid-1;
            }else{
                start = mid+1;
            }
        }

        return ans;
    }
    public static void main(String[] args) {
        int[] nums ={10,20,30,40,50};
        int k = 2;
        System.out.println(allocateMinimumPages(nums,k));
    }
}
