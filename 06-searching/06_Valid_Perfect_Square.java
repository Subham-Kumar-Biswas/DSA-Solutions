// 367. Valid Perfect Square
// Input: num = 16
// Output: true
// Input: num = 14
// Output: false

class IsPerfectSquare {
    public static void main(String[] args) {
        int num = 16;
        System.out.println(isPerfectSquare(num));
    }

    public static boolean isPerfectSquare(int num) {
        if (num < 2) {
            return true;
        }

        long start = 2;
        long end = num/2;

        while (start <= end) {
            long mid = start + (end - start) / 2;

            long guess = mid * mid;

            if (guess == num) {
                return true;
            } else if (guess > num) {
                end = mid -1;
            } else {
                start = mid + 1;
            }
        }

        return false;
    }
}