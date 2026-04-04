import java.util.Scanner;

public class StudentResult {
    static void displayStudentGrade(String name,char grade) {
        if(grade=='X'){
            System.out.println("Entered marks is invalid");
        }
        else if (grade != 'F') {
            System.out.println(name + " got " + grade + " grade");
        }else{
            System.out.println(name+" has failed");
        }
    }
    static char calculateGrade(double score) {
        if (score > 100 || score < 0) {
            return 'X';
        } else {
            if (score >= 90) {
                return 'A';
            } else if (score >= 80) {
                return 'B';
            } else if (score >= 70) {
                return 'C';
            } else if (score >= 50) {
                return 'D';
            } else {
                return 'F';
            }
        }
    }
    public static void main(String[] args) {
        System.out.println("Enter the name of the student:");
        Scanner scanner=new Scanner(System.in);
        String name=scanner.nextLine();
        System.out.println("Enter total marks obtained by "+name+" (0-100)");
        double marks=scanner.nextDouble();
        char grade=calculateGrade(marks);
        displayStudentGrade(name,grade);
        scanner.close();
    }
}
