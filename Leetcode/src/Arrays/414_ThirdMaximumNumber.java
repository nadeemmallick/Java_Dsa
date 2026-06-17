package Arrays;

class ThirdMaximumNumber {
  public static int thirdMax(int[] nums) {

    for (int i = 0; i < nums.length; i++) {
      int max = nums[i];
      if (max > nums[i + 1]) {
          nums[i] = nums[i + 1];
      }
        }
    return 0;
  }

  public static void main(String[] args) {
    int[] arr = {3, 2, 1,2};
    System.out.println(thirdMax(arr));
  }
    }

