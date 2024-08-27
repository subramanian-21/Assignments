package OOPS.assignment_11;

import OOPS.assignment_10.InitializeVector;

import java.util.Stack;

/**
 * 1. Write a Java program that creates a `Stack` of integers. Push the numbers 10, 20, 30, 40, and 50 onto the stack. Then, pop the top element and print the remaining elements in the stack.
 */
public class PushAndPopIntoStack {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        for(int i = 10;i<= 50;i+=10){
            stack.push(i);
        }
        System.out.println(stack);
        while (!stack.isEmpty()){
            System.out.println(stack.pop());
        }
    }
}
