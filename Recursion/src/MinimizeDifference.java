public class MinimizeDifference {
    public static void main(){
        int[][] mat = {{1,2,3},{4,5,6},{7,8,9}};
        int target = 13;
        System.out.println(minimizeDifference(mat,target));
    }
    public static int minimizeDifference(int[][] mat, int target){
        int row = 0;
        int sum = 0;
        int ans = solve(sum,target,mat,row);
        return ans;
    }
    public static int solve(int sum, int target, int[][] mat, int row){
        if(row >= mat.length){
            //calculate the difference between the target and sum
            return Math.abs(target - sum);
        }

        int min = Integer.MAX_VALUE;
        for(int i = 0; i < mat[row].length; i++){
            int ans = solve(sum+mat[row][i],target,mat,row+1);
            min = Math.min(min,ans);
        }
        return min;
    }
}
