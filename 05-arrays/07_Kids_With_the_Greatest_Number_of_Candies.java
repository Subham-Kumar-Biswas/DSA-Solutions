// Leetcode - #1431 Kids With the Greatest Number of Candies
// Input: candies = [2,3,5,1,3], extraCandies = 3
// Output: [true,true,true,false,true] 

import java.util.ArrayList;
import java.util.List;

class Solution {
    public static void main(String[] args) {
        int[] candies = {2,3,5,1,3};
        int extraCandies = 3;

        List<Boolean> result = kidsWithCandies(candies, extraCandies);

        System.out.println(result);
    }

    public static List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        int max = 0;

        for (int i = 0; i < candies.length; i++) {
            if (candies[i] >= max) {
                max = candies[i];
            }
        }

        List<Boolean> KWGC = new ArrayList<>();
        
        for (int j = 0; j < candies.length; j++) {
            KWGC.add(candies[j] + extraCandies >= max);
        }

        return KWGC;
    }
}