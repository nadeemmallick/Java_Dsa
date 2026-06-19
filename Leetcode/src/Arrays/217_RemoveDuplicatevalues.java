package Arrays;

import java.util.Arrays;
import java.util.HashSet;

class RemoveDuplicatevalues {
    //two pointer implemetation
    public static int removeDuplicatevalues(int[] nums) {
        Arrays.sort(nums);
        int i = 0;
        int j= 1;
        int n = nums.length;

        while(j<n){
            if(nums[i]==nums[j]){
                j++;
            }else{
                i++;
                nums[i] = nums[j];
                j++;
            }
        }
        return i+1;
    }

    //HashSet implemetation
    public static int removeDuplicatevalues1(int[] nums) {

        HashSet<Integer> set = new HashSet<>();

        for(int num : nums){
            set.add(num);
        }

        int i = 0;
        for(int num : set){
         nums[i++] = num;
        }
        return set.size();
    }

    public static void main(String[] args) {
        int[] arr = {1,1,2,3,4,5,6,4,6,7};
        System.out.println(removeDuplicatevalues(arr));
        System.out.println(removeDuplicatevalues1(arr));
    }
}
