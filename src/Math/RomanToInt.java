package Math;

import java.util.HashMap;

public class RomanToInt {

    HashMap<Character, Integer> map = new HashMap<>();
    public int RomanToInt(String s) {
        map.put('I', 1);
        map.put('V', 5);
        map.put('X', 10);
        map.put('L', 50);
        map.put('C', 100);
        map.put('D', 500);
        map.put('M', 1000);

        int answer = 0;
        int prev = 0;
        for (int i=s.length()-1; i>=0; i--) {
            char c = s.charAt(i);
            int current =  map.get(c);
            if(current > prev) {
                answer +=  current;
            }
            else{
                answer -= current;
            }
            prev = current;
        }
        return answer;
    }
    public static void main(String[] args) {
        RomanToInt r = new RomanToInt();
        System.out.println(r.RomanToInt("IV"));
    }
}
