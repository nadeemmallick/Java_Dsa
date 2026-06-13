package ArrayQuestions;

public class AvgOfArrElement {
    public static double avgOfArrElement(int[] arr){
        double sum = 0;
        int size = arr.length;

        for (int i : arr) {
            sum = sum + i;
        }
        return sum/size;
    }

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        System.out.println(avgOfArrElement(arr));
    }
}
