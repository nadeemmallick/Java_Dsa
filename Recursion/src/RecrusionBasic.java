public class RecrusionBasic {
    public static void main(String[] args) {
        int n = 3;
        printhello(n);
        System.out.println(factorial(n));
        System.out.println(power(n));

    }
    public static void printhello(int n){
        if(n== 0){
            return;
        }
        System.out.println("Hello");
        printhello(n-1);
    }
    public static int power(int n){
        if(n == 0){
            return 1;
        }
        return 3 * power(n-1);
    }

    public static int factorial(int n){
        if(n == 0){
            return 1;
        }
        return n*factorial(n-1);
    }
}
