public class SumDigits {
    static void main(){
        int num = 567432;
        int ans = sumDigit(num);
        System.out.println(ans);
    }
    public static int sumDigit(int num){
        int sum= 0;
        while(num !=0){
            int digit = num%10;
            sum =  sum + digit;
            num=num/10;
        }
        return sum;
    }
}
