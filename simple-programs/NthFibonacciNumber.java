import java.util.Scanner;

public class NthFibonacciNumber {
    public static void main(String[] args) {
        int firstTerm=0,secondTerm=1,nextTerm=0;
        System.out.println("Enter a  number to find nth fibonacci ");
        Scanner scanner=new Scanner(System.in);
        int num=scanner.nextInt();


        if(num<=0){
            System.out.println("Please enter a valid positive number");
        }
        else if(num==1){
            System.out.println("the "+num+"th fibonacci series is "+1);

        }
        else{

            for(int i=2;i<num;i++){
                nextTerm=firstTerm+secondTerm;
                firstTerm=secondTerm;
                secondTerm=nextTerm;
            }
            System.out.println("the "+num+"th fibonacci series is "+nextTerm);

        }
        scanner.close();
    }

}
