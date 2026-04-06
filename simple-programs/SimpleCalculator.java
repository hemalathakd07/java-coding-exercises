import java.util.Scanner;

public class SimpleCalculator {
    public static void main(String[] args) {
        System.out.println("Enter '+' to perform addition or '-' to perform subtraction");
        char operator;
        Scanner scanner=new Scanner(System.in);
        operator=scanner.next().charAt(0);
        System.out.println("Enter num1:");
        double num1,num2;
        num1=scanner.nextDouble();
        num2=scanner.nextDouble();

        if(operator=='+'){
            double sum=num2+num2;
            System.out.println("Sum of two numbers is "+sum);
        }
        else if(operator=='-'){
            double difference=num1-num2;
            System.out.println("Difference of two numbers is "+difference);
        }
        scanner.close();
    }
}
