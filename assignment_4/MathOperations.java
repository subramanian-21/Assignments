public class MathOperations {

    /**
     * 
1. Create a Java class MathOperations with methods for basic mathematical operations such as 
add() , subtract() , multiply() , and divide() . Implement method overloading to 
allow these operations for integers, doubles, and optionally, other types.
     */
    public static void main(String[] args) {
        System.out.println(add(10,20));
        System.out.println(add(10.23,20));
        float a = 4409.5f;
        System.out.println();
    }
    static int add(int a,int b){ 
        System.out.print("int addition : "+a+"+"+b+"=");
        return a+b;
    }
    static double add(double a,double b){
        System.out.print("double addition : "+a+"+"+b+"=");
        return a+b;
    }
    static float add(float a,float b){
        System.out.print("float addition : "+a+"+"+b+"=");
        return a+b;
    }
    static int subtract(int a,int b){ 
        System.out.print("int subtraction : "+a+"-"+b+"=");
        return a-b;
    }
    static double subtract(double a,double b){
        System.out.print("double subtraction : "+a+"-"+b+"=");
        return a-b;
    }
    static float subtract(float a,float b){
        System.out.print("float subtraction : "+a+"-"+b+"=");
        return a-b;
    }
    static int multiply(int a,int b){ 
        System.out.print("int multiplication : "+a+"x"+b+"=");
        return a*b;
    }
    static double multiply(double a,double b){
        System.out.print("double multiplication : "+a+"x"+b+"=");
        return a*b;
    }
    static float multiply(float a,float b){
        System.out.print("float multiplication : "+a+"x"+b+"=");
        return a*b;
    }
    static int divide(int a,int b){ 
        System.out.print("int division : "+a+"/"+b+"=");
        return a/b;
    }
    static double divide(double a,double b){
        System.out.print("double division : "+a+"/"+b+"=");
        return a/b;
    }
    static float divide(float a,float b){
        System.out.print("float division : "+a+"/"+b+"=");
        return a/b;
    }

}
