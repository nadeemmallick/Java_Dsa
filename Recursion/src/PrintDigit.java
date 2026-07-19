public class PrintDigit {
    public static void main(){
        int n = 123456789;
        printDigit(n);
    }
    public static void printDigit(int n){
        if(n==0){
            return;
        }

        int digit = n%10;
        n = n/10;
        printDigit(n);
        System.out.println(digit);
//        printDigit(n);
    }
    }


