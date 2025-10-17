package arrays;

import java.util.*;
/**
 * Problem: Group Anagrams
 * -----------------------
 * Given an array of strings, group anagrams together.
 *
 * Example:
 * Input: ["eat", "tea", "tan", "ate", "nat", "bat"]
 * Output: [["eat","tea","ate"],["tan","nat"],["bat"]]
 *
 * Approach:
 * - Use a HashMap where the key is the sorted version of the string
 *   and the value is a list of strings that are anagrams of that key.
 *
 * Time Complexity: O(n * k log k) where n is the number of strings and k is the maximum length of a string
 * Space Complexity: O(n)
 */

class StringAnagrams{

    public static List<List<String>> anagramSolution(String[] words){
        HashMap<String, List<String>> map = new HashMap<>();

        for(String s : words){
            char [] charArrayForS = s.toCharArray();
            Arrays.sort(charArrayForS);
            String sortedWord = new String(charArrayForS);
            if(!map.containsKey(sortedWord)){
                map.put(sortedWord, new ArrayList<>());
            }
            map.get(sortedWord).add(s);
        }
        return new ArrayList<>(map.values());
    }
    public static void main(String[] args) {
        String [] words = {"eat", "tea", "tan", "ate", "nat", "bat"};
        System.out.println(anagramSolution(words));
    }
}
