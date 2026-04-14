import java.util.Scanner;

public class GCDOfTwoNumbers {
    public static void main(String[] args) {
        int num1,num2,temp=0;
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter a num1:");
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
        System.out.println("GCD of "+originalNum1+" and "+originalNum2+" is "+num1);
    }
}