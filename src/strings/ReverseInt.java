package strings;

import java.util.*;



class ReverseInt {
    public static int  reverseInt(int numbers){
        int result = 0;
        while(numbers!=0){
            int remainder = numbers%10;
            int temp = (result*10)+remainder;
            if((temp-remainder)/10 != result){
                return 0;
            }
            result = temp;
            numbers = numbers/10;
        }
        return result;



    }
    public static void main(String[] args) {
        System.out.println(reverseInt(1234));
    }
}

