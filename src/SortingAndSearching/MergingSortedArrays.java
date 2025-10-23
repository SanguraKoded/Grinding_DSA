package SortingAndSearching;

public class MergingSortedArrays {
    public static void mergeSortedArrays(int [] nums1, int m, int [] nums2, int n) {
        int n1Pointer = m - 1;
        int n2Pointer = n - 1;
        int last = nums1.length-1;
        while(n2Pointer>=0){
            if(n1Pointer>=0 && nums1[n1Pointer]>nums2[n2Pointer]){
                nums1[last]=nums1[n1Pointer];
                n1Pointer--;
                last--;
            }
            else{
                nums1[last]=nums2[n2Pointer];
                n2Pointer--;
                last--;
            }

        }
    }

    public static void main(String[] args) {
        int [] nums1 = {1,2,3,0,0,0};
        int [] nums2 = {2,5,6};
        mergeSortedArrays(nums1, 3, nums2, 3);
        for(int num : nums1){
            System.out.print(num + " ");
        }
    }
}
