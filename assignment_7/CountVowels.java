package assignment_7;

public class CountVowels {
    // 1. Create a program to count vowels in a given string using string functions 

    public static void main(String[] args) {
        String sample = "hi hello how are you iam subramanian";

        System.out.println(calculateVowels(sample));
        System.out.println(calculateVowelsRecursion(sample));
    }
    static int calculateVowels(String str){
        int count = 0;

        for(int i = 0;i<str.length();i++){
            char ch = str.charAt(i);
            if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u'){
                count++;
            }
        }
        return count;
    }
    static int calculateVowelsRecursion(String str){
        if(str.isEmpty()) return 0;

        char ch = str.charAt(0);
         if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u'){
            return 1+calculateVowelsRecursion(str.substring(1));
        }
        return calculateVowelsRecursion(str.substring(1));
    }
}
