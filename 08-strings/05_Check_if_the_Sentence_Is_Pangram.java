// Leetcode - #1832 Check if the Sentence Is Pangram
// Input: sentence = "thequickbrownfoxjumpsoverthelazydog"
// Output: true

class Solution {
    public static void main(String[] args) {
        String sentence = "thequickbrownfoxjumpsoverthelazydog";
        System.out.println(checkIfPangram(sentence));
    }

    public static boolean checkIfPangram(String sentence) {
        boolean[] booleans = new boolean[26];
        for (int i = 0; i < sentence.length(); i++) {
            int index = sentence.charAt(i) - 'a';
            booleans[index] = true;
        }

        int count = 0;
        for (int j = 0; j < booleans.length; j++) {
            if (booleans[j] == true) {
                count++;
            }
        }

        if (count == 26) {
            return true;
        } else {
            return false;
        }
    }
}