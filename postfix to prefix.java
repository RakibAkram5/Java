import java.util.*;

class GFG {
    // Checks if the character is one of the basic arithmetic operators.
    static boolean isOperator(char x) {
        return (x == '+' || x == '-' || x == '*' || x == '/');
    }

    // Converts a postfix expression to a prefix expression.
    static String postToPre(String post_exp) {
        // Use the correct generic type: "String" (not "string")
        Stack<String> s = new Stack<>();
        int length = post_exp.length();

        // Process each character in the postfix expression.
        for (int i = 0; i < length; i++) {
            char c = post_exp.charAt(i);
            if (isOperator(c)) {
                // For an operator, pop two elements from the stack.
                if (s.size() < 2) {
                    System.out.println("Invalid postfix expression");
                    return "";
                }
                String op1 = s.pop();
                String op2 = s.pop();
                // Form the new string in prefix format: operator + operand2 + operand1.
                String temp = c + op2 + op1;
                s.push(temp);
            } else {
                // For operands, push them as strings.
                s.push(c + "");
            }
        }
        // At the end, there should be exactly one element which is the prefix expression.
        if (s.size() != 1) {
            System.out.println("Invalid postfix expression");
            return "";
        }
        return s.pop();
    }

    // Main method to test the conversion.
    public static void main(String[] args) {
        String postfix = "AB+CD-*"; // Example postfix expression
        String prefix = postToPre(postfix);
        System.out.println("Postfix Expression: " + postfix);
        System.out.println("Prefix Expression: " + prefix);
    }
}
