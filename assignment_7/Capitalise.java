package assignment_7;

public class Capitalise {
    public static void main(String[] args) {
        System.out.println(capitalise("hi hello this is me"));
    }
    static String capitalise(String str){
        StringBuilder sb = new StringBuilder(str);
        sb.setCharAt(0, Character.toUpperCase(sb.charAt(0)));
        for(int i = 0;i<sb.length();i++){
            if(sb.charAt(i) == ' ' && i < sb.length()-1){
                sb.setCharAt(i+1, Character.toUpperCase(sb.charAt(i+1)));
            }
        }

        return sb.toString();
    }
}
