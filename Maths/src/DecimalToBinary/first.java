package DecimalToBinary;

import java.util.Scanner;

import static java.lang.Math.pow;

public class first {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number :");
        int num = sc.nextInt();

        int ans = 0;
        int i = 0;

        while(num != 0){

            int bit = num & 1;
             ans = (int) ((bit * pow(10,i)) + ans);
             num = num >> 1;
             i++;
        }
        System.out.println(ans);
    }
}
