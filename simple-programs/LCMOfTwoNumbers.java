// least common multiple of two numbers:
// lcm=num1*num2/gcd(num1,num2)

import java.util.Scanner;

public class LCMOfTwoNumbers {
    public static void main(String[] args) {
        int num1,num2,temp=0;
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter num1:");
        num1=scanner.nextInt();
        System.out.println("Enter num2:");
        num2=scanner.nextInt();
        int originalNum1=num1;
        int originalNum2=num2;

        while(num2!=0){
            temp=num2;
            num2=num1%num2;
            num1=temp;
        }

        int lcm=(originalNum1*originalNum2)/num1;
        System.out.println("LCM of "+originalNum1+" and "+originalNum2+" is "+lcm);
        scanner.close();
    }
}
