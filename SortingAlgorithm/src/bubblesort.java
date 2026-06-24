import java.util.Scanner;

public class bubblesort {
    public static void bubblesort(int[] arr){
        int n = arr.length;
        for(int i = 0; i<n-1; i++){//round chale ga
            for(int j = 0; j<n-i-1; j++){
                if(arr[j]>arr[j+1]){ //agar j bada haua j+1 se to swap ho jiye ga
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
    }

    public static void main(String args[]){
        int[] arr = {5,6,3,1};
        bubblesort(arr);
        for(int n:arr){
            System.out.print(n+" ");
        }
    }
}
