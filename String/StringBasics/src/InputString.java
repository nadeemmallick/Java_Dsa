import java.util.Scanner;

public class InputString {
    static void main(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your name :");
        String name = sc.nextLine(); // nextLine() is used to read the line
        System.out.println("Your name is : " + name);

        System.out.println("Enter your name :");
        String order = sc.next(); // next() is used to read the word 1 word only
        System.out.println("Your name is : " + order);
    }
}
