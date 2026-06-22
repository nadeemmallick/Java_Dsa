package TwoDArray;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class WaveOrder {
    public List<Integer> waveOrder(int[][] matrix) {
        List<Integer> result = new ArrayList<>();
        int m = matrix.length;
        int n = matrix[0].length;

        for(int col = 0; col<n; col++){
            // odd col to bottom to top
            if((col & 1)==1){
                for(int row = m-1; row>=0; row--){
                    result.add(matrix[row][col]);
                }
                //even col to top to bottom
            }else {
                for(int row = 0; row<m; row++){
                    result.add(matrix[row][col]);
                }
            }
        }
        return result;
    }
    public static void main(String[] args) {
        int[][] arr = {{1,2,3},{4,5,6},{7,8,9}};
        WaveOrder obj = new WaveOrder();
        List<Integer> ans = obj.waveOrder(arr);
        System.out.println(ans);


    }
}
