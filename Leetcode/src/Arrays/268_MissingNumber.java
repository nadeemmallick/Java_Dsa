package Arrays;

class MissingNumber {
    public static int missingNumber(int[] nums) {

        int xorsum = 0;

        for(int n : nums){
            xorsum = xorsum^n;
        }
        for(int i = 0; i<=nums.length; i++){
            xorsum = xorsum^i;
            }
        return xorsum;
        }
        public static void main(String[] args) {
        int[] nums = {0,1,3};
        System.out.println(missingNumber(nums));

        }
    }



