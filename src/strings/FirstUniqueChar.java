package strings;

import java.util.*;
class FirstUniqueChar {

    public static int firstUniqueChar(String word){
        if (word == null || word.length() == 0) return -1;
        int [] charCounts = new int [26];
        for(int i=0; i<word.length(); i++){
            charCounts[word.charAt(i)-'a']++;
        }

        for (int i=0; i<word.length(); i++){
            if(charCounts[word.charAt(i)-'a']==1){
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        System.out.println(firstUniqueChar("leetcode"));
    }
}
