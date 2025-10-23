package SortingAndSearching;

public class FirstBadVersion extends VersionControl {

    public FirstBadVersion(int badVersion) {
        super(badVersion);
    }

    public int firstBadVersion(int n){
        int start = 1;
        int end = n;
        while(start<=end){
            int mid = start + (end-start)/2;
            if(isBadVersion(mid)){
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return start;
    }
    public static void main(String[] args) {
        FirstBadVersion fbv = new FirstBadVersion(4);
        int n = 5;
        System.out.println("First bad version is: " + fbv.firstBadVersion(n));
    }
}
