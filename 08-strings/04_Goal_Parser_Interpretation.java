// Leetcode - #1678 Goal Parser Interpretation
// Input: command = "G()(al)"
// Output: "Goal"

class GoalParserInterpretation {
    public static void main(String[] args) {
        String command = "G()(al)";
        System.out.println(interpret(command));
    }

    public static String interpret(String command) {
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < command.length(); i++) {
            if (command.charAt(i) == 'G') {
                builder.append("G");
            } else if (command.charAt(i) == '(') {
                if (command.charAt(i+1) == ')') {
                    builder.append("o");
                    i++;
                } else {
                    builder.append("al");
                    i+=3;
                }   
            } 
        }
        return builder.toString();
    }
}