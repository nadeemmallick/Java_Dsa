package TwoDArray;

import java.util.ArrayList;
import java.util.List;

public class sumOfEachColumn {
    public List<Integer> sumCol(int[][] arr){
        List<Integer> Sum_row = new ArrayList<>();
        int m = arr.length;
        int n = arr[0].length;
        for(int col = 0; col<n; col++){
            int sum = 0;
            for(int row = 0; row<m; row++){
                int value = arr[row][col];
                sum = sum+value;
            }
            Sum_row.add(sum);
        }
        return Sum_row;
    }
    public static void main(String[] args) {
        int[][] arr = {{1,2,3},{4,5,6},{7,8,9}};
        sumOfEachColumn obj = new sumOfEachColumn();
        List<Integer> ans = obj.sumCol(arr);
        System.out.println(ans);
    }
}
