import java.util.Scanner;

public class SimpleCalculatorUsingMethods {
    static void add(int num1,int num2){
        int sum=num1+num2;
        System.out.println("Sum of two numbers "+num1+","+num2+" is "+sum);
    }
    static void subtraction(int num1,int num2){
        int difference=num1-num2;
        System.out.println("Difference of two numbers "+num1+","+num2+" is "+difference);
    }
    static void multiplication(int num1,int num2){
        int product=num1*num2;
        System.out.println("Product of two numbers "+num1+","+num2+" is "+product);
    }
    static void division(int num1,int num2){
        if(num2!=0){
            int quotient=num1/num2;
            System.out.println("Quotient of "+num1+","+num2+" is "+quotient);
        }
        else{
            System.out.println("Denominator is zero! Division cannot be performed");
        }
    }
    static void modulo(int num1,int num2){
        if(num2!=0){
            int remainder=num1%num2;
            System.out.println("Quotient of "+num1+","+num2+" is "+remainder);
        }
        else{
            System.out.println("Denominator is zero! Modulo operation cannot be performed");
        }
    }

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter a number:");
        int num1=scanner.nextInt();
        System.out.println("Enter a number:");
        int num2=scanner.nextInt();
        add(num1,num2);
        subtraction(num1,num2);
        multiplication(num1,num2);
        division(num1,num2);
        modulo(num1,num2);
    }

}
