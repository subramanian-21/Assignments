package OOPS.assignment_11;

import java.util.Stack;

public class ValidateParenthesis {
    public static void main(String[] args) {
        String parenthesis = "(((()))";
        System.out.println(isValid(parenthesis));
    }
    static boolean isValid(String str){
        Stack<Character> stack = new Stack<>();
        for(int i = 0;i<str.length();i++){
            if(str.charAt(i) == '('){
                stack.push(')');
            }else {
                stack.pop();
            }
        }
        return stack.isEmpty();
    }
}
