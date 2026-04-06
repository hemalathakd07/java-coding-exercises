import java.util.Scanner;

public class SimpleCalculator {
    public static void main(String[] args) {
        int choice,num1,num2;
        System.out.println("Enter 1 to perform addition");
        System.out.println("Enter 2 to perform subtraction");
        System.out.println("Enter 3 to perform multiplication");
        System.out.println("Enter 4 to perform division");
        System.out.println("Enter 5 to perform modulus operation");
        Scanner scanner=new Scanner(System.in);
        choice=scanner.nextInt();
        System.out.println("Enter num1:");
        num1=scanner.nextInt();
        System.out.println("Enter num2:");
        num2=scanner.nextInt();

        if(choice>5 || choice<1){
            System.out.println("Invalid operation chosen!");
        }
        else {
            if (choice == 1) {
                int sum = num1 + num2;
                System.out.println("Sum of two numbers is " + sum);
            } else if (choice == 2) {
                int difference = num1 - num2;
                System.out.println("Difference between two numbers is " + difference);
            } else if (choice == 3) {
                int product = num1 * num2;
                System.out.println("Product of two numbers is " + product);
            } else if(choice == 4){
                if (num2 != 0) {
                    int quotient = num1 / num2;
                }
                else{
                    System.out.println("Division cannot be performed as 0 is in the denominator");
                }
            }
            else{
                int quotient=num1%num2;
                System.out.println("Quotient is "+quotient);
            }
        }
        scanner.close();
    }
}