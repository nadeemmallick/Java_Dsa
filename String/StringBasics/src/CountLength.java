public class CountLength {
    public static void main(String[] args) {
        String str = "Hello World";
        System.out.println(countLength(str));

    }

    public static int countLength(String str){
        int count = 0;
        for(int i=0; i<str.length(); i++){
            count++;
        }
        return count;
    }
}
