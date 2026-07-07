package BinarySearch;

public class non_duplicate {
    public static void main(String[] args) {
        int [] nums = {10,10,20,30,30,40,40,50,50,60,60};
        System.out.println(nonDuplicate(nums));
        System.out.println(nonDuplicate1(nums));

    }
    public static int nonDuplicate1(int[] nums){
        int n = nums.length;
        int s = 0;
        int e = n - 1;
        while (s <= e) {
            int mid = s + (e - s) / 2;

            if (s == e) { // single value input hua to answer yahan he aa jiye ga
                return nums[s];
            }

            int currentValue = nums[mid]; // current value hum mid mann le gai

            int previousValue = nums[mid - 1];
            if (mid - 1 >= 0) {
                previousValue = nums[mid - 1];
            }

            int nextValue = nums[mid + 1];
            if (mid + 1 < n) {
                nextValue = nums[mid + 1];
            }

            if (currentValue != previousValue && currentValue != nextValue) {
                return currentValue;
            }

            if (currentValue != previousValue && currentValue == nextValue) {
                int startingIndexPair = mid;
                if ((startingIndexPair & 1) == 1) {
                    e = mid - 1;
                } else {
                    s = mid + 1;
                }
            }

            if (currentValue == previousValue && currentValue != nextValue) {
                int endingIndexPair = mid;
                if ((endingIndexPair & 1) == 1) {
                    s = mid + 1;
                } else {
                    e = mid - 1;
                }
            }
        }
        return -1;
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
