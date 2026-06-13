package ArrayQuestions;

public class UnsortedArray_inArray {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,3,8,9,10};
        System.out.println(unsortedArray(arr));

    }
    public static int unsortedArray(int[] arr){
        for(int i=0;i<arr.length;i++){
            if(arr[i+1] <= arr[i]){
                return arr[i + 1];
            }
        }
        return -1;
    }
}
