class NumberOfSteps {
    public static void main(String[] args) {
        int num = 14;
        System.out.println(numberOfSteps(num));
    }

    public static int numberOfSteps(int num) {
        return helper(num, 0);
    }

    private static int helper (int num, int steps) {
        if (num == 0) {
            return steps;
        } else if (num % 2 == 0) {
            return helper(num/2, ++steps);
        } else {
            return helper(num-1, ++steps);
        }
    }
}