package DSTopicWise.arrays;

public class SortedColumns {
    public static void main(String[] args) {
        String[] arr = {"zyx","wvu","tsr"};

        System.out.println(inValidStrings(arr));
    }
    static int inValidStrings(String[] strings){
        int invalid = 0;
        for(int i = 0;i<strings[0].length();i++){
            if(!validColumn(strings, i)){
                invalid++;
            }
        }
        return invalid;
    }
    static boolean validColumn(String[] str, int ind){
        for(int i = 0;i<str.length-1;i++){
            char current = str[i].charAt(ind);
            int next = str[i+1].charAt(ind);
            if(current > next){
                return false;
            }
        }
        return true;
    }
}
