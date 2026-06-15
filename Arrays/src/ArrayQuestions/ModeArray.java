package ArrayQuestions;

import java.util.HashMap;

public class ModeArray {
    public static int modeArray(int[] arr){

    HashMap<Integer, Integer> frequency = new HashMap<>();
    for (int num : arr) {
      frequency.put(num, frequency.getOrDefault(num, 0) + 1);
    }
    int max_frequency = -1;
    int max_frequency_key = -1;
    for (int key : frequency.keySet()) {
      int current_key = key;
      int current_key_frequency = frequency.get(key);
      if (current_key_frequency > max_frequency) {
        max_frequency = current_key_frequency;
        max_frequency_key = current_key;
      }
    }
    return max_frequency_key;
  }

  public static void main(String[] args) {
    int[] arr = {1, 2, 7, 5, 5, 6, 7, 7, 8, 9};
    System.out.println(modeArray(arr));
  }
}
