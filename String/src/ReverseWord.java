public class ReverseWord {
    public static void main(String[] args) {
        String str = "Hello World";
        ReverseWord obj = new ReverseWord();
        System.out.println(obj.reverseWord(str));

    }

    public String reverseWord(String str) {
        StringBuilder ans = new StringBuilder();
        int i = str.length() - 1;

        while (i >= 0) {
            //remove the trial space
            while (i >= 0 && str.charAt(i) == ' ') {
                i--;
            }
            //check the value of i
            if (i < 0) {
                break;
            }
            int j = i;
            //find the start index of the word
            while (j >= 0 && str.charAt(j) != ' ') {
                j--;
            }
            //jaise he space wale index prr aia waise he word wale
            ans.append(str, j + 1, i + 1);

            while (j >= 0 && str.charAt(j) == ' ') {
                j--;
            }
            if (j >= 0) {
                ans.append(' ');
            }
            i = j;

        }
        return ans.toString();
    }
}
