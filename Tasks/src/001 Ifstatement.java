import java.util.Scanner;

class Ifstatement {
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.println("\n WELCOME TO ELIGIBLE CRITERIA CENTER");
        System.out.print("Please enter your name:  ");
        String name = sc.nextLine();
        System.out.print("Please enter your age: ");
        int age = sc.nextInt();
        System.out.print("Please enter your gender: ");
        String gender = sc.next();

        if("Male".equals(gender)) {
            if(age > 50) {
                System.out.println(name +"Senior citizen you can vote all three election");
            }else if(age >= 25) {
                System.out.println(name +"You can vote in town  election");
            } else if (age < 18) {
                System.out.println(name +"You can vote in home  election");
            }
        } else if ("Female".equalsIgnoreCase(gender)) {
            if(age > 50) {
                System.out.println(name +" you become a Senior citizen you can vote all three election");
            }else if(age >= 25) {
                System.out.println(name +" You can vote in town  election");
            } else if (age < 18) {
                System.out.println(name +" You can vote in home  election");
            }

        }else {
            System.out.println(name +" please register first in election");
        }
    }
}
