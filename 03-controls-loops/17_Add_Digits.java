// Leetcode - #258 Add Digits
// Input: num = 38
// Output: 2

class AddDigits {
    public static void main(String[] args) {
        int n = 38;
        System.out.println(addDigits(n));
    }

    public static int addDigits(int num) {
        while(num > 9) {
            int sum = 0;

            while(num != 0) {
                sum += num % 10;
                num /= 10;
            }

            num = sum;
        }

        return num;
    }    
}