package strings;
import java.util.*;

public class LongestSubstring {
    public static int longestSubstring(String word){
        if(word==null || word=="" || word.length()==0){
            return 0;
        }
        HashSet<Character> charSet = new HashSet<>();
        int maxLength = 0;
        int left = 0;
        for(int i=0; i<word.length(); i++){
            while(!charSet.add(word.charAt(i))){
                charSet.remove(word.charAt(left));
                left++;

            }
            maxLength = Math.max(maxLength, (i-left)+1);
        }
        return maxLength;
    }
    public static void main(String[] args) {
        System.out.println(longestSubstring("abcabcbb"));
    }
}
