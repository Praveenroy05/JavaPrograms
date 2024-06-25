package Programs;

import java.util.Stack;

public class ParenthesisValidator {

    public static boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();

        for (char c : s.toCharArray()) {
            // Push the corresponding closing bracket to the stack
            if (c == '(') {
                stack.push(')');
            } else if (c == '{') {
                stack.push('}');
            } else if (c == '[') {
                stack.push(']');
                // If the current character is a closing bracket, check if it matches the top of the stack
            } else if (c == ')' || c == '}' || c == ']') {
                if (stack.isEmpty() || stack.pop() != c) {
                    return false;
                }
            }
        }

        // If the stack is empty, all the brackets are balanced
        return stack.isEmpty();
    }

    public static void main(String[] args) {
        String input1 = "({[]})";
        String input2 = "({[})";
        String input3 = "((())";

        System.out.println("Input: " + input1 + " is balanced: " + isValid(input1));
        System.out.println("Input: " + input2 + " is balanced: " + isValid(input2));
        System.out.println("Input: " + input3 + " is balanced: " + isValid(input3));
    }
}
