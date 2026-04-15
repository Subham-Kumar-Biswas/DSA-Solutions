// Leetcode - #1108 Defanging an IP Address
// Input: address = "1.1.1.1"
// Output: "1[.]1[.]1[.]1"

class Solution {
    public static void main(String[] args) {
        String address = "1.1.1.1";
        System.out.println(defangIPaddr(address));    
    }

    public static String defangIPaddr(String address) {
        StringBuilder builder = new StringBuilder();

        for (int i = 0; i < address.length(); i++) {
            char current = address.charAt(i);
            
            if (current == '.') {
                builder.append("[.]");
            } else {
                builder.append(current);
            }
        }
        return builder.toString();
    }
}