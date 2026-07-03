package BinarySearch;

public class painterPatition {
    public static void main(String[] args) {
        int[] arr = {10,20,30,40};
        int k = 2;
        System.out.println(painter_problem(arr,k));

    }
    public static boolean is_valid(int [] arr, int k, int mid){
        int painterCount = 1;
        int painted_length = 0;

        for(int i =0; i<arr.length; i++){
            if(arr[i] + painted_length <= mid){
                painted_length += arr[i];
            }else{
                painterCount++;
                if(arr[i] > mid || painterCount > k){
                    return false;
                }else{
                    painted_length = 0;
                    painted_length = arr[i] + painted_length;
                }
            }
        }
        return true;

    }
    public static int painter_problem(int[] arr, int k){
        int n = arr.length;
        int start = 0;
        int sum = 0;
        for(int i = 0; i < n; i++){
            sum += arr[i];
        }
        int end = sum;
        int ans = -1;

        while(start <= end){
            int mid = start + (end - start)/2;
            if(is_valid(arr, k, mid)){
                ans = mid;
                end = mid - 1;
            }else{
                start = mid + 1;
            }
        }
        return ans;
    }
}
