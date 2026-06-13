package ArrayQuestions;

public class MaxElement {
    public static int maxElement(int[] arr){
        int max = arr[0];
        for (int i : arr) {
            if(i>max){
                max = i;
            }
        }
        return max;
    }
    public static void main(String[] args) {
        int[] arr = {1,29,3,47,51};
        System.out.println(maxElement(arr));
    }
}
