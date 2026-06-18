package Arrays;

class dutchFlag {
    //optimal approch
    public static int[] sortColors2(int[] nums) {
        int low =0;
        int mid = 0;
        int high = nums.length-1;
        while(mid<=high){
            if(nums[mid]==0){
                int temp = nums[low];
                nums[low] = nums[mid];
                nums[mid] = temp;
                low++;
                mid++;
            }
            else if(nums[mid]==1){
                mid++;
            }
            else{
                int temp = nums[mid];
                nums[mid] = nums[high];
                nums[high] = temp;
                high--;
            }
        }
        return nums;
    }
    //brute force approach
    public static int[] sortColors(int[] nums) {
    int zero = 0;
    int one = 0;
    int two = 0;

    for(int n : nums){
      if (n == 0) {
        zero++;
      } else if (n == 1) {
        one++;
      } else {
        two++;
      }
    }
    int i = 0;
    while (zero --> 0) {
        nums[i++] = 0;
    }
    while (one --> 0) {
      nums[i++] = 1;
    }
    while (two --> 0) {
      nums[i++] = 2;
    }
    return nums;
    }
    public static void main(String[] args) {
        int[] nums = {0,1,2,0,1,2};
        sortColors2(nums);
        for (int j : nums) {
            System.out.print(j + " ");
        }

    }
}
