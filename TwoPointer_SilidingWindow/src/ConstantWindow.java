public class ConstantWindow {
    public static void main(){
        int[] arr = {-1,2,3,3,4,5,-1};
        int k = 4;
        System.out.println(constantWindow(arr,k));
    }
    public static int constantWindow(int[] arr,int K){
        int l = 0;
        int r = K - 1;
        int sum = 0;
        //first window
        for (int i = 0; i < K; i++) {
            sum = sum + arr[i];
        }

        //slide window
        int max_sum = sum;
        while (r < arr.length - 1) {
            sum = sum - arr[l];
            l++;
            r++;
            sum = sum + arr[r];
            max_sum = Math.max(max_sum, sum);

        }
        return max_sum;
    }

}



