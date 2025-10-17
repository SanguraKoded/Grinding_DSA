package strings;

import java.util.*;
class ReverseString {
    public static String  reverseString(String word){
        String reversedWord = "";
        for(int i = word.length()-1; i>=0; i--){
            reversedWord += word.charAt(i);
        }
        return reversedWord;
    }
    public static void main(String[] args) {

        System.out.println(reverseString("Nairobi"));
    }
}
