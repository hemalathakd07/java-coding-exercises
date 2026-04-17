//check whether the given number is prime or not

import java.util.Scanner;

public class CheckPrime {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter a number:");
        int num=scanner.nextInt();
        boolean isPrime=true;
        if(num<=1){
            isPrime=false;
        }
        else{
            for(int i=2;i<=num/2;i++){ //(int i=2;i<=math.sqrt(num);i++) .. math.sqrt(num)--> belongs to import java.lang .. package
                if(num%i==0){
                    isPrime=false;
                    break;
                }
            }
        }

        if(isPrime){
            System.out.println("The given number "+num+" is a prime number");
        }
        else{
            System.out.println("The given number "+num+" is not a prime number");
        }
        scanner.close();
    }
}