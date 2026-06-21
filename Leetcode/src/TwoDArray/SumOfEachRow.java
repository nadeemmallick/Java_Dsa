package TwoDArray;

import java.util.ArrayList;
import java.util.List;

public class SumOfEachRow {
    public List<Integer> sumRow(int[][] arr){
        List<Integer> ans = new ArrayList<>();
        int m = arr.length;
        int n = arr[0].length;
        for(int row = 0; row<m; row++){
            int sum = 0;
            for(int col = 0; col<n; col++){
                int value = arr[row][col]; // uss row or col ka value btta raha hai
                sum = sum + value;
            }
            ans.add(sum);
        }
        return ans;
    }

    public static void main(String[] args) {
        int[][] arr = {{1,2,3},{4,5,6},{7,8,9}};
        SumOfEachRow obj = new SumOfEachRow();
        List<Integer> ans = obj.sumRow(arr);
        System.out.println(ans);
    }
}
