import java.util.Scanner;
public class AverageWeights {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        
        System.out.print("Enter Number of Persons :");
        int numberOfPersons = scanner.nextInt();
        double averageWeights = average(numberOfPersons);
        System.out.printf("%.2f",averageWeights);
    }
    static double average(int numberOfPersons){
        double totalWeights = 0;
        System.out.print("Enter "+ numberOfPersons +" weights :" );
        for(int i = 0;i<numberOfPersons;i++){
            totalWeights+=scanner.nextInt();
        }
        scanner.close();
        double totalPeople = numberOfPersons;

        return totalWeights/totalPeople;
    }
}
