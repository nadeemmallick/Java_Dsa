public class count {
    public static void main(){
        counts(5);
    }
    public static void counts(int n ){
//        if(count > n){
//            return;
//        }
//        System.out.println(count);
//        count++;
//        counts(n,count);

        if (n == 0 ){
            return;
        }
        counts(n-1);
        System.out.println(n);



    }
}
