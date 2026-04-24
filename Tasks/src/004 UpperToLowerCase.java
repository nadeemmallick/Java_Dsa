import java.util.Scanner;
class UpperToLowerCase {
    static void main() {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter Your Name please in upper case :");
        String name = input.nextLine();

        String name2 = name.toLowerCase() ;
        System.out.println("Upper case name = " + name2);

    }
}
