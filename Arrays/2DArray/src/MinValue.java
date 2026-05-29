public class MinValue {
    static void main(){
        int[][] arr = {{23,45,67},{12,34,56}};
        int min = arr[0][0];
        for(int i = 0; i<arr.length;i++){
            for(int j = 0; j<arr[i].length;j++){
                if(arr[i][j]<min){
                    min = arr[i][j];
                }
            }
        }
        System.out.println(min);

    }
}
