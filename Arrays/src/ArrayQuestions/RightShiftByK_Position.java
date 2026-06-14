package ArrayQuestions;

public class RightShiftByK_Position {
    public static void rightShiftByK_Position(int[] arr, int k){
     int n = arr.length;
     for(int j = 1; j<=k; j++){ // Same logic as right shift just increase an loop for k
         int temp = arr[n-1];
         for(int i = n-1; i>0; i--){
             arr[i] = arr[i-1];
         }
         arr[0] = temp;
     }
    }
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        rightShiftByK_Position(arr,3);
        for (int j : arr) {
            System.out.print(j + " ");
        }
    }

}
