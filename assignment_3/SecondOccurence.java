import java.util.Scanner;
public class SecondOccurence {
    // 4. Write a program to find second occurrence of a given number in an array
    public static void main(String[] args) {
        int[] arr = {1,2,3,3,2};
        Scanner s = new Scanner(System.in);
        int num = s.nextInt();
        int c = 2;
        int ind = -1;
        for(int i = 0;i<arr.length;i++){
            if(c == 0){
                break;
            }else{
                if(arr[i] == num){
                    ind = i;
                    c--;
                }
            }
            
        }
        System.out.println(ind);
    }
}
