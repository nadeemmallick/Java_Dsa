package TwoDArray;

public class RotationImag {
    public void rotate(int[][] matrix){
        int n = matrix.length;

        for(int i = 0; i<n; i++){
            for(int j = i+1; j<n; j++){
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }

        for(int row = 0; row<n; row++){
            int startcol =0;
            int endcol = n-1;
            while(startcol < endcol){
                int temp = matrix[row][startcol];
                matrix[row][startcol] = matrix[row][endcol];
                matrix[row][endcol] = temp;
                startcol++;
                endcol--;
            }
        }
    }

    public static void main(String[] args) {
        int[][] matrix = {{1,2,3},{4,5,6},{7,8,9}};
        RotationImag obj = new RotationImag();
        obj.rotate(matrix);
        for(int i = 0; i<matrix.length; i++){
            for(int j = 0; j<matrix[i].length; j++){
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}
