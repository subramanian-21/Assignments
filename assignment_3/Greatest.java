import java.util.Scanner;
public class Greatest {
    // 1. Take three numbers from the user and print the greatest number.
    public static void main(String args[]){
        Scanner s = new Scanner(System.in);
        System.out.println("Enter Three Numbers :");
        int a = s.nextInt();
        int b = s.nextInt();
        int c = s.nextInt();

        if(a > b){
            if(a > c){
                System.out.println(a+" is the greatest.");
            }else{
                System.out.println(c+" is the greatest.");
            }
        }else{
            if(b>c){
                System.out.println(b+" is the greatest.");
            }else{
                System.out.println(c+" is the greatest.");
            }
        }
    }
}
