//Check whether the given number is perfect number or not
//
//perfect number is a positive number whose sum is equals to it's proper divisors excluding number itself
//        6 -> 1,2,3
//        28-> 1,2,4,7,14

import java.util.Scanner;

public class PerfectNumber {
    public static void main(String[] args) {
        System.out.println("Enter a number:");
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        int i = 1, sum = 0;
        if (num <1) {
            System.out.println("Enter a valid number");
        } else {
            while (i <= num/2) { //while(i<num)
                if (num % i == 0) {
                    System.out.print(i+" "); // printing divisors
                    sum += i;
                }
                i++;
            }
            if (sum == num) {
                System.out.println("\nThe given number " + num + " is a perfect number");
            } else {
                System.out.println("\nThe given number " + num + " is not a perfect number");
            }
        }
        scanner.close();
    }
}
