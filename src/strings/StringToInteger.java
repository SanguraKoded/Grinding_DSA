package strings;
import java.util.*;


public class StringToInteger {
    public static int stringToInteger(String word) {
        int index = 0;
        int sign = 1;
        int answer = 0;

        if (word == null) {
            return 0;
        }
        String trimmedString = word.trim();
        if (trimmedString.length() == 0) {
            return 0;
        }
        if (trimmedString.charAt(index) == '-') {
            sign = -1;
            index++;
        }
        if (trimmedString.charAt(index) == '+') {
            index++;
        }

        while (index < trimmedString.length() && Character.isDigit(trimmedString.charAt(index))) {
            int digit = trimmedString.charAt(index) - '0';

            if (answer > Integer.MAX_VALUE / 10 ||
                    (answer == Integer.MAX_VALUE / 10 && digit > Integer.MAX_VALUE % 10)) {
                return sign == 1 ? Integer.MAX_VALUE : Integer.MIN_VALUE;
            }
            answer = answer * 10 + digit;
            index++;


        }
        return answer * sign;
    }
    public static void main(String[] args) {
        System.out.println(stringToInteger("   -42"));
    }
}
