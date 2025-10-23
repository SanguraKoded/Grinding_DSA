package SortingAndSearching;


// This is a mock (fake) version of the LeetCode parent class
public class VersionControl {
    // You can set a bad version number for testing
    private int badVersion;

    // Constructor to set which version is bad
    public VersionControl(int badVersion) {
        this.badVersion = badVersion;
    }

    // Simulate LeetCode's isBadVersion method
    public boolean isBadVersion(int version) {
        return version >= badVersion;
    }
}

