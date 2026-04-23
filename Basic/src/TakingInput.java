import java.math.BigInteger;
import java.sql.SQLOutput;
import java.util.Scanner;

public class TakingInput {
    static void main() {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your first number :");
        int number1 = input.nextInt();
        System.out.println("Enter your second number :");
        int number2 = input.nextInt();
        int sum = number1 + number2;
        System.out.println("Sum = " + sum);

        BigInteger big = input.nextBigInteger();
        System.out.println(big);

        System.out.println("Enter the flag :");
        boolean flag = input.nextBoolean();

        System.out.println("Enter the short value :");
        short s = input.nextShort();

        System.out.println("Enter the long value :");
        long l = input.nextLong();


        System.out.println(flag);
        System.out.println(s);
        System.out.println(l);

    }
}
