import java.util.Scanner;

public class IsPrime {
    static int PrimeChecker(int num){
        if(num<=1){
            return -1;
        }
        else{
            for(int i=2;i<num;i++){
                if(num%i==0){
                    return -1;
                }

            }
            return 1;
        }

    }

    public static void main(String[] args) {
        System.out.println("Enter a number:");
        Scanner scanner=new Scanner(System.in);
        int number=scanner.nextInt();
        int result=PrimeChecker(number);
        if(result==1){
            System.out.println(number+" is a prime number");
        }
        else{
            System.out.println(number+" is not a prime number");
        }
        scanner.close();
    }
}
