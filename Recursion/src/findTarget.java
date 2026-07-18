public class findTarget {
    public static void main(){
        int[] arr = {1,2,3,4,5,6,7,8,9,10};
      int target = 3;
      int i = 0;
      int ans = findTarget(arr,target,i);
      System.out.println(ans);
     }
     public static int findTarget(int[] arr, int i, int target){
        if(i >= arr.length){
            return -1;
        }
        if(arr[i] == target){
            return i;
        }
        findTarget(arr, target, i+1);

        return 0;
     }
}
