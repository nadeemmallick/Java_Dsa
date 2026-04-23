import java.util.Scanner;

public class Conditionals {
    public static void main (String arg[]){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your age :");
        int age = input.nextInt();

        //If Statement

//        if(age <= 18){
//            System.out.println("You are under age");
//        }

        //Else Statement

//        if (age > 18){
//            System.out.println("you can vote");
//        }
//        else{
//            System.out.println("you can't vote");
//        }

        //if else if Statement

        if (age <= 18){
            System.out.println("you can vote");
        }
        else if (age <= 43){
            System.out.println("you can vote for children");
        }else if (age >= 60){
            System.out.println("you can vote for senior citizen");
        }else {
            System.out.println("you can't vote");
        }

    }
}
