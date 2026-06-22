package TwoDArray;

public class TransposeMatrix {
    public int[][] transpose(int[][] matrix){
        if(matrix == null || matrix.length == 0){
            return new int[0][0];
        }
        //original array length
        int totalRows = matrix.length;
        int totalCols = matrix[0].length;

        //new array length
        int newRows = totalCols;
        int newCols = totalRows;

        int[][] newMatrix = new int[newRows][newCols];

        for(int i = 0; i<totalRows; i++){
            for(int j = 0; j<totalCols; j++){
                newMatrix[j][i] = matrix[i][j];
            }
        }

       return newMatrix;
    }
    public static void main(String[] arg){
        int[][] matrix = {{1,2},{3,4},{5,6}};
        TransposeMatrix obj = new TransposeMatrix();
        int[][] ans = obj.transpose(matrix);
        for(int i = 0; i<ans.length; i++){
            for(int j = 0; j<ans[i].length; j++){
                System.out.print(ans[i][j] + " ");
            }
            System.out.println();
        }
    }
}
