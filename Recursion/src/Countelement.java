public class Countelement {
    public static void main(){
        int[] n = {1,2,3,4,5,65,6,5,5,5,5};
        int i = 0;
        int target = 5;
        int count = 0;
        count(n,i,target,count);


    }
    public static void count(int[] n, int i , int target, int count){
        if(i >= n.length){
            System.out.println(count);
            return ;
        }
        if(n[i] == target){
            count++;
        }

        count(n,i+1, target, count);
    }
}
