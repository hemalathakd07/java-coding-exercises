import java.util.Scanner;

public class SumOfDigitsOfNumber {
    public static void main(String[] args) {
        System.out.println("Enter a number:");
        Scanner scanner=new Scanner(System.in);
        int num=scanner.nextInt();
        int sum=0,digit;
        int originalNum=num;
        for(;num!=0;){
            digit=num%10;
            sum+=digit;
            num=num/10;
        }
        System.out.println("Sum of "+originalNum+" is "+sum);
        scanner.close();
    }
}
