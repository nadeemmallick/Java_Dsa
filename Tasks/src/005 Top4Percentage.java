import java.util.Scanner;

class Top4Percentage {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int[] marks = new int[5];
        int sum = 0;
        int min = Integer.MAX_VALUE;

        for (int i = 0; i < 5; i++) {
            System.out.print("Enter mark for subject " + (i + 1) + ": ");
            marks[i] = input.nextInt();
            sum += marks[i];

            if (marks[i] < min) {
                min = marks[i];
            }
        }

        int top4Sum = sum - min;
        double percentage = top4Sum / 4.0;

        System.out.println("Top 4 total = " + top4Sum);
        System.out.println("Percentage = " + percentage + "%");

        input.close();
    }
}
