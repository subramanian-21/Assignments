package OOPS.assignment_11;

import java.util.Stack;
// 2. Write a Java program that uses a `Stack` to reverse a string. For example, given the input string "hello", the program should output "olleh".
public class ReverseWithStack {
    public static void main(String[] args) {
        String str = "hello";
        Stack<Character> stack = new Stack<>();
        for(int i = 0;i<str.length();i++){
            stack.push(str.charAt(i));
        }
        String reverse = "";
        while(!stack.isEmpty()){
            reverse += stack.pop();
        }
        System.out.println(reverse);
    }

}
