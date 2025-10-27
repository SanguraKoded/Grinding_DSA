package DesignObjectImplementation;

import java.util.Arrays;
import java.util.Random;
public class ShuffleArray {
    int [] numbers;
    Random rand;

    public ShuffleArray(int[] numbers) {
        this.numbers = numbers;
        this.rand = new Random();
    }

    public int[] reset() {
        return numbers;

    }

    public int[] shuffle() {
        int[] shuffled = numbers.clone();
        for(int i=0; i<shuffled.length; i++){
            int randomNum = rand.nextInt(shuffled.length);
            int temp = shuffled[randomNum];
            shuffled[randomNum] = shuffled[i];
            shuffled[i] = temp;

        }
        return shuffled;
    }

    public static void main(String[] args ){
        int [] array =  {1,2,3,4,5,6,7,8,9,10};
        ShuffleArray a = new ShuffleArray(array);
        System.out.println(Arrays.toString(a.shuffle()));
        System.out.println(Arrays.toString(a.reset()));
    }
}
