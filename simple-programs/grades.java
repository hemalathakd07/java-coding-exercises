//use a switch to assign letter grades based on numeric sources

import java.util.Scanner;

public class grades {
    public static void main(String[] args) {
        System.out.println("Enter your marks:");
        Scanner scanner=new Scanner(System.in);
        int marks;
        marks=scanner.nextInt();
        int grade=marks/10;
        if(marks>100 || marks<0){
            System.out.println("Entered marks is invalid!");
        }
        else {
            String StudentGrade=switch (grade) {
                case 10,9->
                    "A grade";
                case 8->
                    "B grade";
                case 7->
                    "C grade";
                case 6->
                    "D grade";
                case 5->
                    "E grade";
                default->
                    "Fail";
            };
            System.out.println("You got "+StudentGrade);
        }
        scanner.close();
    }
}
