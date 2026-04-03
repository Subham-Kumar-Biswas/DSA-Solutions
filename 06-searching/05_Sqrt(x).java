// Leetcode - #69 Sqrt(x)
// Input: x = 8
// Output: 2

class Sqrt {
    public static void main(String[] args) {
        int x = 8;
        System.out.println(mySqrt(x));
    }

    public static int mySqrt(int x) {
        if (x < 2) {
            return x;
        }
        
        int start = 2;
        int end = x / 2;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            long num = (long)mid * mid;

            if (num == x) {
                return mid;
            } else if (num > x) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return end;
    }
}