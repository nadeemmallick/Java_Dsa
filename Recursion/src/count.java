public class count {
    public static void main(){
        counts(5,1);
    }
    public static void counts(int n , int count){
        if(count > n){
            return;
        }
        System.out.println(count);
        count++;
        counts(n,count);

    }
}
