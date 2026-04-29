public class ArrayMultiplication {
    static void main(){
        int[ ] marks = {2,3,10,20};
        int n= marks.length;
        int multiplication = 1;

        for(int i = 0; i<=n-1; i++){
            multiplication = multiplication * marks[i];
        }
        System.out.println(multiplication);

    }
}
