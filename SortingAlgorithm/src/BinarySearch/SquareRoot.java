package BinarySearch;

import java.util.Scanner;

public class SquareRoot {
    public static int bruteForce(int x){
        int ans = 0;
        if(x == 0){
            return 0;
        }
        for(int i = 1; i*i <= x; i++){
            ans = (int)i;
        }
        return ans;

    }

    public static int optimal(int x){
        int s = 0;
        int e = x;
        int ans = -1;
        while(s<=e){
            int mid = s+(e-s)/2;
            long sq = (long)mid * mid;

            if(sq == x){
                ans = mid;
            }else if(sq > x){
                e = mid-1;
            }else {
                ans = mid;
                s=mid+1;
            }
        }
        return ans;
    }

    public static void main(String args[]){
        int x = 56;
        int ans = bruteForce(x);
        System.out.println(ans);
        int ans2 = optimal(x);
        System.out.println(ans2);
    }
}
