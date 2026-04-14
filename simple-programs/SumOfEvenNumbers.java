//print sum of even numbers between 1 to N

import java.util.Scanner;

public class SumOfEvenNumbers {
    public static void main(String[] args) {
        System.out.println("Enter a number rto find sum of even numbers between 1 to N:");
        Scanner scanner=new Scanner(System.in);
        int num=scanner.nextInt();
        int sum=0;
        for(int i=1;i<=num;i++){
            if(num%i==0){
                sum+=i;
            }
        }
        System.out.println("Sum of even numbers from 1 to "+num+" is "+sum);
    }
}
