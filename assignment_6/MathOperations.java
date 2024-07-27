package assignment_6;
// 2. Write a program to calculate Math operations with Math contents initialized in static block.
class Main{
    public static void main(String[] args) {
        System.out.println(MathOperations.INT_MIN_VALUE);
        System.out.println(MathOperations.INT_MAX_VALUE);
    }
}
public class MathOperations {
    public static  double PI;
    public static final int INT_MAX_VALUE;
    public static final int INT_MIN_VALUE;
    
    static  {
        PI = Math.PI;
        INT_MAX_VALUE = Integer.MAX_VALUE;
        INT_MIN_VALUE = Integer.MIN_VALUE;
    }
}
