import java.util.Scanner;

public class CheckVotingPower {
    static boolean ageCheck(int age){
        if(age>=18){
            return true;
        }
        else{
            return false;
        }
    }

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter age of the person:");
        int age=scanner.nextInt();
        boolean result=ageCheck(age);
        if(result==true){
            System.out.println("Person is eligible to vote");
        }
        else{
            System.out.println("Person is not eligible to vote");
        }
        scanner.close();
    }
}
