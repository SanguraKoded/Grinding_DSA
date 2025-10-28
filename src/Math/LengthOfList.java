package Math;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class LengthOfList {

    public int lengthOfList(int[] nums) {
        List<Integer> subarray = new ArrayList();
        for (int num : nums) {
            int index = Collections.binarySearch(subarray, num);

            if (index < 0) {
                index = -(index + 1);
            }
            if(index == subarray.size()) {
                subarray.add(num);
            }
            else {
                subarray.set(index, num);
            }

        }
        return subarray.size();
    }
    public static void main(String[] args) {
        LengthOfList l = new LengthOfList();
        System.out.println(l.lengthOfList(new int[]{1,2,3,4,5}));
        System.out.println(l.lengthOfList(new int[]{1,2,0,4,5}));
    }
}
