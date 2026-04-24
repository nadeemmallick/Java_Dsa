import java.util.Scanner;

class PercentageOfStudent {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("\nWelcome to Percentage Calculator");
        System.out.print("Please enter the name of the student :");
        String name = sc.nextLine();
        System.out.print("Enter the marks of maths :");
        int maths = sc.nextInt();
        System.out.print("Enter the marks of English :");
        int english = sc.nextInt();
        System.out.print("Enter the marks of science :");
        int science = sc.nextInt();
        System.out.print("Enter the marks of sports :");
        int sports = sc.nextInt();
        System.out.print("Enter the marks of social Science :");
        int socialScience = sc.nextInt();

        double percentage = ((maths + english + science + sports + socialScience )/ 500.0) *100;


        System.out.println(name +" Your over all percentage of five subject is :"+percentage+"%.");
    }
}
