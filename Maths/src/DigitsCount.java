import java.util.Scanner;

public class DigitsCount {
    static void main(){
        int num;
        Scanner sc = new Scanner(System.in);
        num = sc.nextInt();
        int ans =digitsCount(num);
        System.out.println(ans);

    }
    public static int digitsCount(int num){
        int count = 0;
        while(num !=0){
            int digit = num%10;
            count++;
            num=num/10;
        }
        return count;
    }
}
