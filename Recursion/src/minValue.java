public class minValue {
    public static void main(){
        int[] arr = {1,2,3,4,5};
        int i = 0;
        int min = Integer.MAX_VALUE;
        min_value(arr,i,min);

     }
     public static void min_value(int[] arr, int i, int min){
        if(i>=arr.length){
            System.out.println(min);
             return;
         }
        if(arr[i] < min){
            min = arr[i];
        }
        min_value(arr, i+1, min);
     }
}
