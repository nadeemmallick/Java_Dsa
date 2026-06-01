public class PrintAllCharacter {
    public static void printString(String str) {
        int n = str.length();
        for(int i=0;i<n; i++){
            System.out.println(str.charAt(i));
        }


    }
    public static void main(String[] args) {
        String str = "Hello World";
        printString(str);
    }
}
