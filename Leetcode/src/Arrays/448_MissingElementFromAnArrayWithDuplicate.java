package Arrays;

import java.util.ArrayList;
import java.util.List;

class MissingElementFromAnArrayWithDuplicate {
    public List<Integer> missingElement(int[] nums) {
        List<Integer> ans = new ArrayList<>();
        //marking
        int n = nums.length;
        for(int index = 0; index<n; index++){
            int value = Math.abs(nums[index]);
            int position = value-1;
            if(nums[position] > 0){
                nums[position] = -nums[position];
            }
        }
        //traversing array whenever a positive value is prist as same
        for(int i=0; i<n; i++){

            if(nums[i]>0){
                int value_at_index = i+1;
                ans.add(value_at_index);
            }
        }
                 return ans;
    }
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,6,6,7,8,10,10};
        MissingElementFromAnArrayWithDuplicate obj = new MissingElementFromAnArrayWithDuplicate();
        List<Integer> ans = obj.missingElement(arr);
        for (int j : ans) {
            System.out.print(j + " ");
        }

    }
}
