package ArrayQuestions;

import java.util.HashMap;

public class HighestAndLowestFrequency {
    public static int[] highestAndLowestFrequency(int[] arr){

        HashMap<Integer, Integer> frequency = new HashMap<>();
        for (int num : arr) {
            frequency.put(num, frequency.getOrDefault(num, 0) + 1);
        }

        int highest_frequency =Integer.MIN_VALUE;
        int highest_num = -1;

        for(int key : frequency.keySet() ){
            int current_key = key;
            int current_frequency = frequency.get(key);
            if(current_frequency > highest_frequency){
                highest_frequency = current_frequency;
                highest_num = current_key;
            }
        }

        int lowest_frequency = Integer.MAX_VALUE;
        int lowestt_num = -1;
        for(int key : frequency.keySet() ){
            int current_key = key;
            int current_frequency = frequency.get(key);
            if(current_frequency < lowest_frequency){
                lowest_frequency = current_frequency;
                lowestt_num = current_key;
            }
        }
        int ans[] = {highest_num,lowestt_num};
        return ans;

    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 7, 5, 5, 6, 7, 7, 8, 9};
       int[] ans = highestAndLowestFrequency(arr);
       for (int j : ans) {
           System.out.print(j + " ");
       }
    }
}
