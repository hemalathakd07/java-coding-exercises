//A person is eligible to enter the concert only if he/she is older than 18 years and
// should have either a ticket or invited by VIP

import java.util.Scanner;

public class CheckConcertInvitation {
    public static void main(String[] args) {
        int age;
        boolean has_ticket;
        boolean invited_by_VIP;
        System.out.println("Enter your age:");
        Scanner scanner=new Scanner(System.in);
        age=scanner.nextInt();
        System.out.println("Do you have a ticket:(true/false)");
        has_ticket=scanner.nextBoolean();
        System.out.println("Are you invited by VIP?(true/false)");
        invited_by_VIP=scanner.nextBoolean();

        if((age>=18) &&(has_ticket==true||invited_by_VIP==true)) {
            System.out.println("You are allowed to concert");
        }
        else{
            System.out.println("You are not allowed to concert");
        }
        
    }
}
