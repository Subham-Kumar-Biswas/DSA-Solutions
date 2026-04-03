// Leetcode - #278 First Bad Version
// Input: n = 5, bad = 4
// Output: 4

class FirstBadVersion { 
    static int firstBad = 4; 

    public static void main(String[] args) {
        int n = 10; 
        System.out.println(firstBadVersion(n));
    }

    static boolean isBadVersion(int version) {
        return version >= firstBad;
    }

    static int firstBadVersion(int n) {
        int start = 1;
        int end = n;

        while (start < end) {
            int mid = start + (end - start) / 2;

            if (isBadVersion(mid)) {
                end = mid; 
            } else {
                start = mid + 1; 
            }
        }
        return start;
    }
}