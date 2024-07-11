public class TypeCasting {
    //  Write a program to demonstrate compatible type conversions. For eg., 
    //  float to int, double to float, int to short

    public static void main(String[] args) {
        // Two Types of Type casting
        // 1. Widening 2. Narrowing
        byte byteNumber = 10;
        short shortNumber = 1000;

        int intNumber = 100000;
        long longNumber = 10000000L;

        float floatNumber = 100000.22f;
        double doubleNumber = 10000.9032983289328932832;

        // widening 
        // smaller type to larger type
        // byte -> short -> int -> long -> float -> double

        double testDouble = byteNumber; // byte -> double  implicitly
        float testFloat = byteNumber; // shortNumber || intNumber || longNumber || floatNumber
        long testLong = byteNumber;// shortNumber || intNumber || longNumber || floatNumber
        int testInt = byteNumber;// shortNumber || intNumber || longNumber || floatNumber
        short testShort = byteNumber; // shortNumber || intNumber || longNumber || floatNumber

        // narroring
        // larger data type to smaller data type
        // double -> float -> long -> int -> char -> short -> byte

        // double -> byte
        byteNumber = (byte)doubleNumber;
        System.out.println(" Double value :"+doubleNumber);
        System.out.println(" Byte modified double value :"+(byte)doubleNumber);

        // float -> int
        // integer 
        intNumber = (int)floatNumber;
        System.out.println(" FLoat value :"+floatNumber);
        System.out.println(" int modified float value :"+intNumber);

        // double -> float

        System.out.println(" Double value :"+doubleNumber);
        System.out.println(" float modified double value :"+(float)doubleNumber);

        // int -> short 
        System.out.println(" int value :"+intNumber);
        System.out.println(" short modified int value :"+(short)intNumber);
    }
}
