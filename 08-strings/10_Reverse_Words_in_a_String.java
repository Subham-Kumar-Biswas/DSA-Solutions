// Leetcode - #151 Reverse Words in a String
// Input: s = "the sky is blue"
// Output: "blue is sky the"

class Solution {
    public static void main(String[] args) {
        String s = "the sky is blue";
        System.out.println(reverseWords(s));
    }

    public static String reverseWords(String s) {
        String[] words = s.trim().split("\\s+");
        StringBuilder newS = new StringBuilder();

        for(int i = words.length - 1; i >= 0; i--) {
            newS.append(words[i]);
            if(i > 0) {
                newS.append(" ");
            }
        }
        return newS.toString();
    }
}