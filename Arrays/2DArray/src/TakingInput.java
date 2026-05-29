import java.util.Scanner;

public class TakingInput {
    public static void main(String[] args) {
        int[][] arr = new int[3][4];
        Scanner sc = new Scanner(System.in);
        int rowLength = arr.length;

        for (int i = 0; i <= arr.length-1; i++){
            for(int j = 0; j <= arr[i].length-1; j++){
                System.out.println("Enter the value row = " +i+ " col = "+j);
                arr[i][j] = sc.nextInt();
            }
        }

        for(int rowIndex = 0; rowIndex <=rowLength -1; rowIndex++){
            int colLength = arr[rowIndex].length;
            for(int colIndex = 0; colIndex<= colLength-1; colIndex++){
                System.out.print(arr[rowIndex][colIndex] + " ");
            }
            System.out.println();
        }

    }
}
