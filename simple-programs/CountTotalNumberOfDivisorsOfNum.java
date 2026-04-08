import java.util.Scanner;

public class CountTotalNumberOfDivisorsOfNum {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter a number:");
        int num=scanner.nextInt();
        int absNum=Math.abs(num);
        for(int i=1;i<=absNum;i++){
            if(absNum%i==0){
                System.out.println(i);
                System.out.println(-i);
            }
        }
        scanner.close();
    }
}
