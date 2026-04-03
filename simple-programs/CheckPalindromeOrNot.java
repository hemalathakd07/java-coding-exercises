import java.util.Scanner;

public class CheckPalindromeOrNot {
    public static void main(String[] args) {
        System.out.println("Enter a number:");
        Scanner scanner=new Scanner(System.in);
        int num=scanner.nextInt();
        int remainder,reversedNum=0;
        int originalNum=num;

        for(;num!=0;){
            remainder=num%10;
            reversedNum=10*reversedNum+remainder;
            num=num/10;
        }

        if(reversedNum==originalNum){
            System.out.println("The given number "+originalNum+" is a palindrome");
        }
        else{
            System.out.println("The given number "+originalNum+" is not a palindrome");
        }
        scanner.close();
    }
}
