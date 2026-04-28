public class ReverseAlphabetTringle {
    static void main(){
        int n = 5;

        for(int row= 1; row<=n; row++){
            for(int col=1; col<=row; col++){
                int a = n-col;
                int b = 'A';
                int finalanswer = a+b;
                System.out.print((char)finalanswer+" ");
            }
            System.out.println();
        }
    }
}
