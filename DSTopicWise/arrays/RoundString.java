package DSTopicWise.arrays;

public class RoundString {
    public static void main(String[] args) {
        System.out.println(round("00000000", 3));
    }
    static String round(String up, int k){
        if(up.length() <= k){
            return up;
        }
        return round(separateDigits(up, k), k);
    }
    static String separateDigits(String str, int k){
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < str.length(); i+= k) {
            sb.append(addStrings(str, i, i+k));
        }
        return sb.toString();
    }
    static String addStrings(String str, int s, int e){
        int sum = 0;
        for(int i = s;i < str.length() && i < e;i++){
            int num = str.charAt(i) - '0';
            sum += num;
        }
        return ""+sum;
    }
}
