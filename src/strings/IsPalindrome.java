package strings;

import java.util.*;
public class IsPalindrome {

    public static Boolean isPalindrome(String word){
        int left = 0;
        int right = word.length() - 1;
        while(left<right){

            while(left<right && !Character.isLetterOrDigit(word.charAt(left))){
                left++;
            }
            while(left<right && !Character.isLetterOrDigit(word.charAt(right))){
                right--;
            }
            if(Character.toLowerCase(word.charAt(left)) != Character.toLowerCase(word.charAt(right))){
                return false;}
            left++;
            right--;

        }
        return true;

    }
    public static void main(String[] args) {
        System.out.println(isPalindrome("A man, a plan, a canal: Panama")); }
}
