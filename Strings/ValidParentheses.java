package Strings;
import java.util.*;

public class ValidParentheses {
    public boolean isValid(String s) {

        // Stack to hold opening brackets
        Stack<Character> stack = new Stack<>();

        for(char c: s.toCharArray()){
            if(c == '(' || c == '{' || c == '['){
                stack.push(c);
            } else{
                if(stack.isEmpty())
                    return false;

                // Pop the top element and check if it matches the expected opening bracket
                char top = stack.pop();

                if(c == ')' && top != '(' ||
                        c == '}' && top != '{' ||
                        c == ']' && top != '[')
                    return false;
            }
        }
        // If the stack is empty, all brackets are balanced
        return stack.isEmpty();
    }
}

/*
Time Complexity: O(n)
Space Complexity: O(n)
 */
