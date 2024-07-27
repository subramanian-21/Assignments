package multipleClasses;
public class MultipleClasses {
    public static void main(String[] args) {
        SampleClass1 s1 = new SampleClass1();
        SampleClass2 s2 = new SampleClass2();
        SampleClass3 s3 = new SampleClass3();
        //
        MultipleClasses mc = new MultipleClasses();
         SampleInnerClass s4 = mc.new SampleInnerClass();
        // or make SampleInnerClass static
        
        s1.sampleFunction();;
        s2.sampleFunction();;
        s3.sampleFunction();
        s4.sampleFunction();;
    }
    // for each inner classes new class files are generated 
    // which is starts with the class name, $ symbol and the inner class name;
    class SampleInnerClass{
        void sampleFunction(){
            System.out.println("hello");
        }
    }
}
// for each classes new class files are generated while compiled
class SampleClass1{
    void sampleFunction(){
        System.out.println("hello");
    }
}
class SampleClass2{
    void sampleFunction(){
        System.out.println("hello");
    }
}
class SampleClass3{
    void sampleFunction(){
        System.out.println("hello");
    }
}

/**
 * 
 * 
 */