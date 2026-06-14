package ArrayQuestions;

public class ReverseArray {
    
    public static void reverseArray(int [] arr){
        int n = arr.length;
        int i = 0;
        int j = n-1; // array ke length ka last element

        while(i<=j){
            // swap
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            // increment kia humne i ko
            i++;
            // decrement kia humne j ko
            j--;
        }
        //Reverse Array
        for (int k : arr) {
            System.out.print(" "+k);
        }
    }
    
    
    static void main(){
        int [] arr = {1,2,3,4,5,6,7,8,9,10};
        reverseArray(arr);

    }
}
