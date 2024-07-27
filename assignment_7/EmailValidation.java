package assignment_7;
// 4. Write a program to validate email address 
// (contains @ and proper domain format). Note: Don't use regular expressions
public class EmailValidation {
    public static void main(String[] args) {
        System.out.println(isValidEmail("subramanian@g.com"));
    }
    static boolean isValidEmail(String email){
        int atCount = 0;
        int atInd = -1;
        int len = email.length();
        for(int i = 0;i<len;i++){
            if(email.charAt(i) == '@'){  
                atCount++;
                atInd = i;
                if(atCount > 1) return false;
            }
            if(i == len-4){
                if(!email.substring(i).equals(".com")){
                    return false;
                }
            }
        }
        return atInd+1 < len-4;
        
    }
}
