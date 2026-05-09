// Leetcode - #1732 Find the Highest Altitude
// Input: gain = [-5,1,5,0,-7]
// Output: 1

class LargestAltitude {
    public static void main(String[] args) {
        int[] gain = {-5,1,5,0,-7};
        System.out.println(largestAltitude(gain));
    }

    public static int largestAltitude(int[] gain) {
        int max = 0;
        int current = 0;

        for(int i = 0; i < gain.length; i++) {
            current += gain[i];
            if(current > max) {
                max = current;
            }
        }
        
        return max;
    }
}