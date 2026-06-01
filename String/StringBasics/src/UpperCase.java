public class UpperCase {
    public static  void main(String[] args) {
        String str = "abc";
        String result = "";
        int n = str.length();

        for(int i = 0; i < n; i++){
            char ch = str.charAt(i);

            if (ch >= 'a' && ch <= 'z') {
                ch = (char)(ch - 32);
            }

            result += ch;
        }
        System.out.println(result);
        }

    }

