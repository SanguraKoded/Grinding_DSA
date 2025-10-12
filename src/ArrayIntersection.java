import java.util.*;

/**
 * Problem: Intersection of Two Arrays II
 * -------------------------------------
 * Return the intersection of two arrays, including duplicate occurrences.
 *
 * Example:
 * Input: [1,2,2,1], [2,2]
 * Output: [2,2]
 *
 * Time Complexity: O(n + m)
 * Space Complexity: O(n)
 */
public class ArrayIntersection {
    public static int[] arrayIntersection(int[] array1, int[] array2) {
        Hashtable<Integer, Integer> numsMap = new Hashtable<>();
        ArrayList<Integer> intersection = new ArrayList<>();

        for (int num : array1) {
            numsMap.put(num, numsMap.getOrDefault(num, 0) + 1);
        }

        for (int num : array2) {
            if (numsMap.containsKey(num)) {
                intersection.add(num);
                numsMap.put(num, numsMap.get(num) - 1);
                if (numsMap.get(num) == 0) {
                    numsMap.remove(num);
                }
            }
        }

        int[] intersectionArr = new int[intersection.size()];
        for (int i = 0; i < intersection.size(); i++) {
            intersectionArr[i] = intersection.get(i);
        }
        return intersectionArr;
    }

    public static void main(String[] args) {
        int[] arr1 = {1,2,2,1};
        int[] arr2 = {2,2};
        System.out.println(Arrays.toString(arrayIntersection(arr1, arr2)));
    }
}
