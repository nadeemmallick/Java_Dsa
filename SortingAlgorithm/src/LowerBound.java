public class LowerBound {

    public static int lowerBound(int[] arr, int target) {
        int n = arr.length;
        int start = 0;
        int end = n-1;
        int ans = n;
        while (start <= end) {
            int mid = (start + end) / 2;

            if (arr[mid] >= target) {
                //khidr jau
                ans = mid;
                end = mid - 1;
            } else { //agar mid < target hai to right jao
                start = mid + 1;
            }

        }
        return ans;
    }
    public static void main(String[] args){
        int[] arr = { 10,20,30,40,40,40,50,60};
        int target = 45;
        int result = lowerBound(arr, target);
        System.out.println(result);
//        int result = UpperBound(arr,target);
//        System.out.println(result);

    }
}
