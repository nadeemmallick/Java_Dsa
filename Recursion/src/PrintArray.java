public class PrintArray {
    public static void main(String[] arg){
        int[] arr = {1,2,3,4,5};
        printArray(arr,0);
    }
    public static void printArray(int[] arr, int i){

        if(i >= arr.length){
            return;
        }
        System.out.println(arr[i]);
        printArray(arr, i+1);
    }
}
