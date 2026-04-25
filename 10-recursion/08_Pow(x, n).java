class Pow {
    public static void main(String[] args) {
        double x = 2.00;
        int n = -200000000;
        System.out.println(myPow(x, n));
    }

    public static double myPow(double x, int n) {
        long N = n; // Use long to handle Integer.MIN_VALUE overflow
        if (N < 0) {
            x = 1 / x;
            N = -N;
        }
        
        double result = 1;
        double currentProduct = x;
        
        while (N > 0) {
            if (N % 2 == 1) {
                result *= currentProduct;
            }
            currentProduct *= currentProduct;
            N /= 2;
        }
        return result;
    }
}