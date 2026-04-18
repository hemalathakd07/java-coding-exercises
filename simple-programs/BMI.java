import java.util.Scanner;

public class BMI {
    public static void main(String[] args) {
        double weight, height,BMI;
        System.out.println("Enter weight of a person in kg:");
        Scanner scanner=new Scanner(System.in);
        weight=scanner.nextDouble();
        System.out.println("Enter height of a person in meters:");
        height=scanner.nextDouble();
        BMI=weight/(height*height);
        System.out.println("BMI of a person is "+BMI);
        scanner.close();
    }
}
