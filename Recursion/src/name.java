public class name {
    public static void main(){
        name(5);
    }
    public static void name(int n){
        if(n==0){
            return;
        }
        System.out.println("nadeem");
        name(n-1);
    }
}
