// Leetcode - #1859 Sorting the Sentence
// Input: s = "is2 sentence4 This1 a3"
// Output: "This is a sentence"

class Solution {
    public static void main(String[] args) {
        String s = "is2 sentence4 This1 a3";
        System.out.println(sortSentence(s));
    }

    public static String sortSentence(String s) {
        String[] words = s.split(" ");
        String[] result = new String[words.length];

        for (int word = 0; word < words.length; word++) {
            String currentWord = words[word];
            int lastIndex = currentWord.length() - 1;
            int pos = Character.getNumericValue(currentWord.charAt(lastIndex));

            result[pos - 1] = currentWord.substring(0, lastIndex);
        }

        StringBuilder builder = new StringBuilder();

        for (int i = 0; i < result.length; i++) {
            builder.append(result[i]);

            if (i < result.length - 1){
                builder.append(" ");
            }
        }
        return builder.toString();
    }
}