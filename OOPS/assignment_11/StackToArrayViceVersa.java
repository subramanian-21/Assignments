package OOPS.assignment_11;

import java.util.Arrays;
import java.util.Stack;

public class StackToArrayViceVersa {
    public static void main(String[] args) {
        double[] arr = {1.1, 2.2, 3.3, 4.4, 5.5};
        Stack<Double> stack = new Stack<>();
        for (int i = 0; i < arr.length; i++) {
            stack.push(arr[i]);
        }
        Double[] a = stack.toArray(new Double[0]);
        System.out.println("stack : "+stack);
        System.out.println("arr : "+Arrays.toString(a));
    }
}
