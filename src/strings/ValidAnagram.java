package strings;

import java.util.*;
/**
 * Problem: Valid Anagram
 * ----------------------
 * Given two strings, determine if one is an anagram of the other.
 *
 * Example:
 * Input: s = "anagram", t = "nagaram"
 * Output: true
 * Input: s = "rat", t = "car"
 * Output: false
 *
 * Time Complexity: O(n)
 * Space Complexity: O(1)
 */
public class ValidAnagram {
    public boolean validAnagram(String word1, String word2) {
        int charCount[] = new int[26];
        if(word1.length() != word2.length()) return false;
        for(int i = 0; i<word1.length();i++){
            charCount[word1.charAt(i)-'a']++;
            charCount[word2.charAt(i)-'a']--;
        }
        for(int count : charCount){
            if(count != 0) return false;
        }
        return true;

    }
    public static void main(String[] args) {
        ValidAnagram va = new ValidAnagram();
        String s1 = "anagram";
        String s2 = "nagaram";
        System.out.println(va.validAnagram(s1, s2)); // true
    }
}
