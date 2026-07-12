public class PermutationInString {
    public static void main(String[] args) {
        String s1 = "ab";
        String s2 = "baaedraaabc";
        PermutationInString obj = new PermutationInString();
        System.out.println(obj.Permutation(s1, s2));
    }
    public boolean compareFrequency(int[] count1, int[] count2){
        for (int i = 0; i < 26; i++){
            if(count1[i] != count2[i]){
                return false;
            }
        }
        return true;
    }

    public boolean Permutation( String s1, String s2){

        if (s1.length() > s2.length()) {
            return false;
        }
//frequency table of s1
        int[] count1 = new int[26];
        for (int i = 0; i < s1.length(); i++) {
            char ch = s1.charAt(i);
            int index = ch - 'a';
            count1[index]++;
        }
//frequency table of s2 of 1st window
        int i = 0;
        int windowLength = s1.length();
        int[] count2 = new int[26];
        for (i = 0; i < windowLength; i++) {
            char ch = s2.charAt(i);
            int index = ch - 'a';
            count2[index]++;
        }

        if (compareFrequency(count1, count2)) {
            return true;
        } else {
//add new character to window and check
            while (i < s2.length()) {
                char newChar = s2.charAt(i);
                int newChrIndex = newChar - 'a';
                count2[newChrIndex]++;

//old character is removed from window and check
                int oldIndex = i - windowLength;
                char oldChar = s2.charAt(oldIndex);
                int frequencyOldCharIndex = oldChar - 'a';
                count2[frequencyOldCharIndex]--;
                i++;
                if (compareFrequency(count1, count2)) {
                    return true;
                }
            }
        }
        return false;
    }
}
