import java.util.Scanner;

public class TemperatureConverter {
    static double DegreeToFahrenheit(double c){
        double f=9/5*c+32;
        return f;
    }

    public static void main(String[] args) {
        System.out.println("Enter temperature in degree celscius:");
        Scanner scanner=new Scanner(System.in);
        double celsius=scanner.nextDouble();
        double fahrenheit=DegreeToFahrenheit(celsius);
        System.out.println(celsius+" degree = "+ fahrenheit+" fahrenheit");
        scanner.close();
    }
}
