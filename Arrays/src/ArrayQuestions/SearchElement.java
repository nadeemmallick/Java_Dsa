package ArrayQuestions;

public class SearchElement {
    public static boolean searchElement(int[] arr, int target){
        for(int i = 0 ; i<arr.length; i++){
            if(arr[i] == target){
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
    int[] arr = {23, 45, 87, 65, 43, 45};
    boolean target = searchElement(arr, 43);
    System.out.println(target);
  }
}
