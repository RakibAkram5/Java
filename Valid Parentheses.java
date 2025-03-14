import java.util.Stack;

class GFG {
    // Method to check if the input string has balanced parentheses
    static boolean isBalanced(String s) {
        Stack<Character> st = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            
            // If it's an opening bracket, push it to the stack.
            if (c == '(' || c == '{' || c == '[') {
                st.push(c);
            } 
            // If it's a closing bracket, check for a match.
            else if (c == ')' || c == '}' || c == ']') {
                // If the stack is empty, there's no matching opening bracket.
                if (st.isEmpty()) {
                    return false;
                }
                char top = st.pop();
                // If the popped element doesn't match, it's not balanced.
                if (!isMatching(top, c)) {
                    return false;
                }
            }
            // If you want to ignore other characters (like letters, numbers, etc.), do nothing.
        }
        // If the stack is empty, all brackets matched; otherwise, it's unbalanced.
        return st.isEmpty();
    }

    // Helper method to check if two brackets are matching pairs.
    static boolean isMatching(char open, char close) {
        return (open == '(' && close == ')') ||
               (open == '{' && close == '}') ||
               (open == '[' && close == ']');
    }

    // Main method to test the isBalanced method.
    public static void main(String[] args) {
        String expression = "{[(a+b)*(c+d)]}";
        System.out.println("Is balanced? " + isBalanced(expression)); // should print true if balanced
    }
}
