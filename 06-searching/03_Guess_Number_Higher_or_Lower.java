//Leetcode - #374 Guess Number Higher or Lower
// Input: n = 10, pick = 6
// Output: 6

class GuessGame {
    static int pickedNumber = 6;

    public static void main(String[] args) {
        int n = 10;
        System.out.println("The picked number was: " + guessNumber(n));
    }

    static int guess(int num) {
        if (num > pickedNumber) return -1;
        if (num < pickedNumber) return 1;
        return 0;
    }

    public static int guessNumber(int n) {
        int start = 1;
        int end = n;

        while (start <= end) {
            int mid = start + (end - start) / 2;
            int result = guess(mid); 

            if (result == 0) {
                return mid;
            } else if (result == -1) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return -1;
    }
}