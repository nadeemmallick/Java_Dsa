import java.util.Arrays;

public class zerosAndOnce {
    public static void main(String[] args) {
        int [] arr = {0,1,1,0,0,1};

        System.out.println(Arrays.toString(zerosAndOnce(arr)));


    }
    public static int[] zerosAndOnce(int[] arr) {
        int n = arr.length;
        int i = 0;
        int j = n-1;

        while (i < n && j >= 0) {
            if(arr[i] == 1 && arr[j] == 0){
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                i++;
                j--;
            }else if(arr[i] == 0 && arr[j] == 1){
                i++;
                j--;
            }else{
                System.out.println(-1);
            }
        }
        return arr;
    }
}
