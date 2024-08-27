package DSTopicWise.arrays;

public class PrefixStringCount {
    public static void main(String[] args) {
        String[] arr = {"leetcode","win","loops","success"};
        String pref = "code";

        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i].charAt(0) == pref.charAt(0)){
                int c = 1;
                for (int j = 1; j < pref.length(); j++) {
                    if(pref.charAt(j) == arr[i].charAt(j)){
                        c++;
                    }else {
                        break;
                    }
                }
                if(c == pref.length()){
                    count++;
                }
            }
        }
        System.out.println(count);
    }
}
