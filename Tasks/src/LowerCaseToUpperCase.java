import java.util.Scanner;

public class LowerCaseToUpperCase {
    static void main() {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter Your Name please :");
        String name = input.nextLine();

        String name2 = name.toUpperCase() ;
        System.out.println("Upper case name = " + name2);

    }
}
