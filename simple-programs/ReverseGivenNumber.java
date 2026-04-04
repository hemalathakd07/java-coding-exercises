import java.util.Scanner;

public class ReverseGivenNumber {
    public static void main(String[] args) {
        System.out.println("Enter a number:");
        Scanner scanner=new Scanner(System.in);
        int num=scanner.nextInt();
        int originalNum=num;
        int digit,reversedNum=0;
        for(;num!=0;){
            digit=num%10;
            reversedNum=10*reversedNum+digit;
            num=num/10;
        }
        System.out.println("reversed number of "+originalNum+" is "+reversedNum);
        scanner.close();
    }
}
