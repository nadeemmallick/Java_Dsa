public class maxElement {
    public static void main(String[] arg){
        int[] arr = {1,2,3,4,5};
        int max = Integer.MIN_VALUE;
        int i = 0;
        max_element(arr,i,max);
//        System.out.println(max);

    }
    public static void max_element(int[] arr, int i,int max){
        //bc
        if(i >= arr.length){
            System.out.println(max);
            return;
        }

        if(arr[i] > max){
            max = arr[i];
        }
        max_element(arr, i+1, max);
    }
}
