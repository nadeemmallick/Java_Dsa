package Arrays;

public class ArrayExceptItself238 {
    public static void main(String[] args) {
        int[] nums ={1,2,3,4};
        int[] ans = productExceptSelf2(nums);
        for (int i : ans) {
            System.out.print(i + " ");
        }
    }
    public static int[] productExceptSelf(int[] nums) {
        int len = nums.length;
        int[] res = new int[len];

        for(int i = 0; i < len; i++) {
            int product = 1;
            for(int j = 0; j < len; j++) {
                if(i != j) {
                    product *= nums[j];
                }
            }
            res[i] = product;
        }
        return res;
    }

    public static int[] productExceptSelf2(int[] nums){
        int len = nums.length;
        int[] left = new int[len];
        int[] right = new int[len];
        int[] ans = new int[len];

        //left product
        left[0] = 1;
        for (int i = 1; i < len; i++) {
            left[i] = left[i - 1] * nums[i - 1];
        }

        //right product
        right[len - 1] = 1;
        for (int j = len - 2; j >= 0; j--) {
            right[j] = right[j + 1] * nums[j + 1];

        }
        //multiplication
        for (int i = 0; i < len; i++) {
            ans[i] = left[i] * right[i];
        }
        return ans;
    }
}
