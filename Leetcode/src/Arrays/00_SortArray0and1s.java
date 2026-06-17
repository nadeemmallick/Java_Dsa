package Arrays;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class SortArray0and1s {

    //Two-pointer approach
    public static int[] sortArray(int[] nums) {
        int n = nums.length;
        int i = 0;
        int j = n-1;

        while(i<=j){
            if(nums[i] == 1 && nums[j]==0){
                //swap
                int temp = nums[i];
                nums[i] = nums[j];
                nums[j] = temp;
            }if(nums[i]==0){
                //i ko increment mtlb age badda de gai
                i++;
            }if(nums[j]==1){
                //j ko decrement krr de gai
                j--;
            }
        }
        return nums;
    }


    //Counting approach
    public static int[] sortArray1(int[] nums) {
        int countZeros = 0;

        // Count only zeros (ones = n - zeros)
        for (int num : nums) {
            if (num == 0) {
                countZeros++;
            }
        }

        // Fill the array
        int i = 0;
        while (i < countZeros) {
            nums[i++] = 0;
        }
        while (i < nums.length) {
            nums[i++] = 1;
        }
        return nums;
    }


    //Collections.sort() approach
    public static void sortArray2(int[] nums) {
        // Convert array to ArrayList
        List<Integer> list = new ArrayList<>();
        for (int num : nums) {
            list.add(num);
        }

        // Sort using Collections
        Collections.sort(list);

        // Copy back to array
        for (int i = 0; i < list.size(); i++) {
            nums[i] = list.get(i);
        }
    }


    public static void main(String[] args) {
        int[] arr = {0,1,0,1,0,1,0,1};
        sortArray(arr);
        int[] arr1 = {1,0,1,0,0,0,1,1,1,1,1};
        sortArray1(arr1);
        int[] arr2 = {0,0,0,0,1,0,1,1,1,1,1,0,1,0,0,1};
        sortArray2(arr2);

        System.out.println("Two-pointer approach:");
        for (int m : arr) {
            System.out.print(m + " ");
        }

        System.out.println();
        System.out.println("Counting approach:");
        for (int m : arr1) {
            System.out.print(m + " ");
        }

        System.out.println();
        System.out.println("Collections.sort() approach:");
        for (int m : arr2) {
            System.out.print(m + " ");
        }
    }
}
