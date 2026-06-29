package BinarySearch;

public class rotatedArrayLeet33 {

    public static void main(String[] args) {
        int[] nums = {4,5,6,7,0,1,2};
        int target = 3;
        System.out.println(search(nums,target));
    }


    public static int pivotElement(int[] nums) {
        int n = nums.length;
        int s =0;
        int e = n-1;
        int ans = -1;

        while(s<=e){
            int mid = s+(e-s)/2;
            if(nums[mid] <= nums[n-1]){
                e = mid-1;
            }else{
                ans = mid;
                s = mid+1;
            }
        }
        return ans;
    }


    public static int binarySearch(int[] nums,int s, int e,int target){
        int n = nums.length;
        while(s<=e){
            int mid = s+(e-s)/2;
            if(nums[mid] == target){
                return mid;
            }else if(nums[mid] < target){
                s = mid+1;
            }else{
                e = mid-1;
            }
        }
        return -1;
    }



    public static int search(int[] nums, int target) {
        int pivotIndex = pivotElement(nums);
        int n = nums.length;

        if(pivotIndex == -1){
            int ans = binarySearch(nums,0,n-1,target);
            return ans;
        }else{
            //l1
            int startArray1 = 0;
            int endArray1 = pivotIndex;
            if(target >= nums[startArray1] && target <= nums[endArray1]){
                int ans = binarySearch(nums,startArray1,endArray1,target);
                return ans;
            }

            //l2
            int startArray2 = pivotIndex+1;
            int endArray2 = n-1;
            if(target >= nums[startArray2] && target <= nums[endArray2]){
                int ans = binarySearch(nums,startArray2,endArray2,target);
                return ans;
            }
        }
        return -1;
    }
}
