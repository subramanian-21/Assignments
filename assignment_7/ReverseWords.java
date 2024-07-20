package assignment_7;

public class ReverseWords {
    public static void main(String[] args) {
        System.out.println(reverseWords("hi hello how are you"));
    }
    static String reverseWords(String str){
        int ind = str.indexOf(" ");

        if(ind == -1) return str;
        else {
            return reverseWords(str.substring(ind+1))+" "+str.substring(0,ind);
        }
    }
}
