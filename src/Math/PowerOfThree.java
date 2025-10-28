package Math;

public class PowerOfThree {

    public boolean isPowerOfThree(int n) {
        if(n>1){
            while(n%3==0){
                n/=3;
                            }
        }
        return n==1;
    }
    public boolean isPowerOfThree2(int n) {
        return (Math.log10(n)/Math.log10(3))%0==1;
    }

    public static void main(String[] args) {
        PowerOfThree p = new PowerOfThree();
        System.out.println(p.isPowerOfThree2(2));
        System.out.println(p.isPowerOfThree(2));
    }
}
