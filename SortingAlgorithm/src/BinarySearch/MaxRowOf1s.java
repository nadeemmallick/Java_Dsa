package BinarySearch;

public class MaxRowOf1s {
    public static void main(String[] args) {
        int[][] arr = {{0,0,0,0,1},{0,0,0,1,1},{0,0,1,1,1}};
        System.out.println(maxRowOf1s(arr));
        System.out.println(maxRowOf1s1(arr));

    }
    public static int maxRowOf1s(int[][] arr){
        int n1 = arr.length;
        int n2 = arr[0].length;

        int maxfreq = 0;
        int maxrow = -1;
        for(int i = 0; i<n1; i++){
            int count = 0 ;
            for(int j = 0; j<n2; j++){
                if(arr[i][j] == 1){
                    count++;
                }
            }
            if(count > maxfreq){
                maxfreq = count;
                maxrow = i;
            }
        }

        return maxrow;
    }
    //optimal
    public static int maxRowOf1s1(int[][] arr){
        int totalrow = arr.length;
        int totalcol = arr[0].length;
        int maxi = -1;
        int maxRowIndex = -1;
        for(int i = 0; i<totalrow; i++){
            int firstOccurance = getFirstOccurance(arr, i);
            int one_count = totalcol - firstOccurance;
            if(one_count > maxi){
                maxi = one_count;
                maxRowIndex = i;
            }
        }
        return maxRowIndex;

    }
    public static int getFirstOccurance(int[][] arr, int rowIndex){
        int totalRow = arr.length;
        int totalCol = arr[0].length;
        int target = 1;
        int ans = -1;

        //handle krna hai wo row jisme 0 hai bss
        if(arr[rowIndex][totalCol-1] == 0){
            return totalCol;
        }
        else{
            int s = 0;
            int e = totalCol-1;
            while(s<=e){
                int mid = s+(e-s)/2;
                if(arr[rowIndex][mid] == 0){
                    s = mid+1;
                }else {
                    ans = mid;
                    e = mid-1;
                }
            }
        }
        return ans;

    }
}
