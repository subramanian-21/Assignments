public class Scope {
    // 4. Write a program with an if statement. Declare one variable 
    // inside the if block and another one outside. Print both variables 
    // inside and outside the if block to understand variable scope. 
    // (Comment the compiler error in your program while submitting)
    public static void main(String[] args) {
        
        int a;
        if(true){ // if it was false it gives compilation error
            // because of accessing without assigning in  else block;
            {
                int b = 0;
                // this doesnt give error 
                // because this scopes b will be deallocated
                // child block can access parent block's scope 
                // but parent's block cannot access child's scope
            }

           //  int a = 0; this gives compilation error
           // because a in the local scope must not be redeclared
           int b = 0;
        }else{
            System.out.println(a);
        }
        // System.out.println(b); this gives compilation error 
        // because b is inside the if block and after execution b's memory is deallocated
    }
}
