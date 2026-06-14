package ArrayQuestions;

public class SwappingAlternate {

    public static int[] swapAlternate(int[] arr){
        int temp = 0;
        for(int i = 0; i<arr.length-1; i=i+2){
            temp = arr[i];
            arr[i] = arr[i+1];
            arr[i+1] = temp;
        }
        return arr;
    }
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,9};
        int[] newArr = swapAlternate(arr);
        for (int j : newArr) {
            System.out.print(j);
        }
    }
}
