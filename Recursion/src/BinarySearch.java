public class BinarySearch {
    public static void main(){
        int[] arr = {1,2,3,4,5,6,7,8,9,10};
        int target = 5;
        System.out.println(binary_search(arr,target));
    }

    public static int binary_search(int[] arr, int target) {
        int s = 0;
        int e = arr.length - 1;
        int ans = solve(arr, target, s, e);
        return ans;


    }

    public static int solve(int[] arr, int target, int s, int e) {
        //Base Case
        if (s > e) {
            return -1;
        }
        int mid = s + (e - s) / 2;
        if (arr[mid] == target) {
            return mid;
        }
        if (arr[mid] < target) {
            e = mid - 1;
        } else if (arr[mid] > target) {
            s = mid + 1;

        }

        //Recursive Case
        return solve(arr, target, s, e);
    }
}
