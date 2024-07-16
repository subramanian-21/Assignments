import java.util.Scanner;
import javax.sound.sampled.SourceDataLine;

public class PrintPrime {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("ENter limit ");
        int n =s.nextInt();
        for(int i = 2;i<=n;i++){
            if(isPrime(i)){
                System.out.print(i+" ");
            }
        }
    }
    static boolean isPrime(int n){
        for(int i = 2;i<n;i++){
            if(n%i == 0){
                return false;
            }
        }
        return true;
    }
}
