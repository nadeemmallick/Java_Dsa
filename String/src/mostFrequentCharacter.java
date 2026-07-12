import java.util.HashMap;
import java.util.HashSet;

public class mostFrequentCharacter {
    public static void main(String[] args) {
        String str = "testpaper";
        System.out.println(mostFrequentCharacter(str));
        System.out.println(mostFrequentCharacter1(str));
    }
    public static char mostFrequentCharacter1(String str){
        int[ ] freq = new int[26];
        for(int i = 0; i< str.length(); i++){
            freq[str.charAt(i)-'a']++;
        }
        int maxFreq = -1;
        char maxChar = ' ';
        for(int i = 0; i<26; i++){
            if(freq[i] > maxFreq){
                maxFreq = freq[i];
                maxChar = (char)(i+'a');
            }
        }
        return maxChar;
    }
    public static char mostFrequentCharacter(String str){

        HashMap<Character,Integer> map = new HashMap<>();
        for(int i = 0; i< str.length(); i++){
            char ch = str.charAt(i);
            map.put(ch,map.getOrDefault(ch,0)+1);
        }
        int maxFreq = -1;
        char maxChar = ' ';
        for(char ch : map.keySet()){
            if(map.get(ch) >= maxFreq){
                maxFreq = map.get(ch);
                maxChar = ch;
            }
        }
        return maxChar;
    }
}
