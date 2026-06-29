package BinarySearch;

public class PeakElement {
    public static int peakElement(int[] arr){
        int n = arr.length;
        int start = 0;
        int end = n-1;
        int ans = -1;

        while(start <= end){
            int mid = start+(end-start)/2;

            if(arr[mid] < arr[mid+1]){
                start = mid+1;
            }else{
                ans = mid;
                end = mid-1;
            }
        }
        return ans;
    }
    public static int peakElement1(int[] arr){
        int n = arr.length;
        int ans = 0;
        for(int i = 1; i<n; i++){
            if(arr[i] > arr[ans]){
                ans = i;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] arr = {0,10,5,2,1,};
        System.out.println(peakElement(arr));
        System.out.println(peakElement1(arr));

    }
}
