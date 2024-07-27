package assignment_2;
import java.util.Scanner;
public class TemperatureConversion {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter celcius :");
         double celcius = s.nextDouble();
         System.out.println(celciusToFahrenheit(celcius));
         s.close();
    }
    static double celciusToFahrenheit(double celcius){
        return (9/(5.0))*celcius+32;
    }
    static double fahrenheitToCelcius(double fahrenheit){
        double fl = 5/9.0;
        return fl*(fahrenheit-32);
    }
}
