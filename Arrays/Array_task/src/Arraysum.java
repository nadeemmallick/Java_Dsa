public class Arraysum {
    static void main(){
        int[] marks = {20,10,40,70};

        int n= marks.length;
        int sum = 0;

        for(int i = 0; i<=n-1; i++){
            int value = marks[i];
            sum = sum + value;

        }
        System.out.println(sum);
    }
}
