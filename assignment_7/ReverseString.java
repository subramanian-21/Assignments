package assignment_7;

public class ReverseString {
    public static void main(String[] args) {
        System.out.println(reverse("null"));
    }
    static String reverse(String str){
        String out = "";
        for(int i = str.length()-1;i>=0;i--){
            out+=str.charAt(i);
        }
        return out;
    }
}
