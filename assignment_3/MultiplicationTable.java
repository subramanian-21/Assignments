import java.util.Scanner;

public class MultiplicationTable {
    // 3. Write a program to print multiplication table of a given number in a neat format
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("Enter Number :");
        int m = s.nextInt();
        System.out.println("Enter limit :");
        int n = s.nextInt();

        for(int i = 1;i<=n;i++){
            System.out.println(m+" X "+i+" = "+ m*i);
        }
    }
}
