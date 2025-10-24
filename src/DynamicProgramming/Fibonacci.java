package DynamicProgramming;
import java.util.*;
public class Fibonacci {

    Hashtable<Long, Long> memo = new Hashtable<>();

    public Long fibonacci(Long n){
        if(memo.containsKey(n)){
            return memo.get(n);
        }
        if(n==1 || n==2){
            return 1L;
        }
        Long result = fibonacci(n-1) + fibonacci(n-2);
        memo.put(n, result);
        return result;
    }

    public Long inefficientFibonacci(Long n){
        if(n==1 || n==2){
            return 1L;
        }
        Long result = inefficientFibonacci(n-1) + inefficientFibonacci(n-2);
        return result;
    }
    public static void main(String[] args) {
        Fibonacci fib = new Fibonacci();
        System.out.println(fib.fibonacci(8L));
        System.out.println(fib.inefficientFibonacci(8L));
    }
}
