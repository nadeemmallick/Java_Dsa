package Arrays;

import java.util.HashMap;

class FirstRepatingNumber {
    public static int firstRepatingNumber(int[] nums) {
        int n = nums.length;
        for(int i = 0; i< n; i++){
            for(int j = i+1; j<n; j++){
            if(nums[i] == nums[j]){
                return nums[i];
            }}
        }
        return -1;
    }

    public static int firstRepatingNumber1(int[] nums) {
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int num : nums){
            map.put(num,map.getOrDefault(num,0)+1);
        }
        for (int i : nums){
            if(map.get(i) >1){
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
    int[] nums = {2,3,1,0,8,5,4};
    System.out.println(firstRepatingNumber(nums));
    System.out.println(firstRepatingNumber1(nums));
    }

}
