public class Constant {
    static void main(String[] args){
        String str = "Hello World";
        System.out.println(constant(str));

    }
    public static int constant(String str){
        {
            int count = 0;

            for (int i = 0; i < str.length(); i++) {
                char ch = Character.toLowerCase(str.charAt(i));

                if (Character.isLetter(ch) &&
                        ch!='a' && ch!='e' && ch!='i' &&
                        ch!='o' && ch!='u') {
                    count++;
                }
            }
            return count;
        }
    }
}
