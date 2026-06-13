package ArrayQuestions;

public class MultiplyArrBy10 {

    public static int[] multiplyArrBy10(int[] arr){
        int size = arr.length;
        int[] newArr = new int[size];

        for(int i = 0; i<size; i ++){
        int element = arr[i];
        int new_element = element * 10;
        newArr[i] = new_element;
        }
        return newArr;

    }
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        int[] newArr = multiplyArrBy10(arr);
        for (int j : newArr) {
            System.out.print(" "+j);
        }
    }
}
