package BinarySearch;

import java.util.Arrays;

public class magneticfield1552 {
    public static void main(String[] arg){
        int[] arr = {1,2,3,4,7};
        int k = 3;
        System.out.println(magnetic_balls(arr,k));

    }
    public static int magnetic_balls(int[] arr, int k) {
        Arrays.sort(arr);
        int n =  arr.length;
        int start = 0;
        int end = arr[n-1]-arr[0];
        int ans =-1;
        while(start<=end){
            int mid = (start+end)/2;
            if(isValid(arr,k,mid)){
                ans  = mid;
                start = mid+1;
            }else{
                end = mid-1;
            }
        }

return ans;
    }
    public static boolean isValid(int[] arr, int k , int mid){
        int ballcount = 1;
        int magneticField = 0;
        for(int i = 0 ; i<arr.length ; i++){
            if(arr[i] - arr[magneticField] >= mid){
                ballcount++;
                magneticField = i;

                if(ballcount==k){
                    return true;
                }
            }
        }
return false;
    }
}
