//print numbers from 1 to N
// for multiples of 3 print Fizz
// for multiples of 5 print Buzz and
// for multiple of both 3 and 5 print FizzBuzz

import java.util.Scanner;

public class FizzBuzzProgram {
    public static void main(String[] args) {
        System.out.println("Enter a number:");
        Scanner scanner=new Scanner(System.in);
        int num=scanner.nextInt();
        for(int i=0;i<=num;i++){
            if(i%3==0 && i%5==0){
                System.out.println("FizzBuzz");
            }
            else if(i%3==0){
                System.out.println("Fizz");
            }
            else if(i%5==0){
                System.out.println("Buzz");
            }
            else{
                System.out.println(i);
            }
        }
        scanner.close();
    }
    
}
