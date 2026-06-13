package ArrayQuestions;

public class pvt_nvtSum {
  public static int[] pvt_nvtSum(int[] arr) {
    int positive_sum = 0;
    int negative_sum = 0;

    for (int i = 0; i < arr.length; i++) {
      if (arr[i] > 0) {
        positive_sum = positive_sum + arr[i];
      } else {
        negative_sum = negative_sum + arr[i];
      }
    }
    int[] ans = {positive_sum, negative_sum};
    return ans;
  }

  public static void main(String[] args) {
    int[] arr = {-1, -2, -3, 4, 5};
    int[] ans = pvt_nvtSum(arr);
    System.out.println("positive sum: " + ans[0]);
    System.out.println(" Negative sum: " + ans[1]);
    }
}
