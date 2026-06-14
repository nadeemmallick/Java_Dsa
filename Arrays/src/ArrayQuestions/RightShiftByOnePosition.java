package ArrayQuestions;

public class RightShiftByOnePosition {
    public static void rightShiftByOnePosition(int[] arr){
        int n = arr.length; // array length

        int temp = arr[n-1]; // last element ko temp variable ke andar store kia

        for(int i = n-1; i>0; i--){ // loop piche se chalana start kia
            arr[i] = arr[i-1]; // i-1 index ke element ko humne i index ke andar store krr liya
        }
        arr[0] = temp; // arr 0 index mai temp ka value store krr liya
    }
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        rightShiftByOnePosition(arr);
        for (int j : arr) {
            System.out.print(j + " ");
        }
    }
}
