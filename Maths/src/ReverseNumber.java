public class ReverseNumber {
    static void main(){
        int num = 12345678;
        int rev= reverse(num);
        System.out.println(rev);
    }
    public static int reverse(int num){
        int reversed = 0;

        while(num!=0){
            int digit = num % 10;
            reversed = reversed*10+digit;
            num = num/10;

        }
        return reversed;
    }
}
