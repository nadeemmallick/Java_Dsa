package ArrayQuestions;

public class Count0s_1s {
    public static int[] count0s1s(int[] arr){
        int ones_count = 0;
        int zeros_count = 0;

        for(int i : arr){
            if(i == 0){
                zeros_count++;
            }else{
                ones_count++;
            }
        }
        int [ ] count = {zeros_count, ones_count};
        return count;
    }
    public static void main(String[] args) {
        int[] arr = {0,1,0,1,0,1,0,1};
        System.out.println("Count of 0s : "+count0s1s(arr)[0]);
        System.out.println("Count of 1s : "+count0s1s(arr)[1]);
    }
}
