//Write a program that prints 2 D array in matrix form

import java.util.Scanner;

public class TwoDArrayInMatrixForm {
    public static void main(String[] args) {
        System.out.println("Enter the number of rows:");
        Scanner scanner=new Scanner(System.in);
        int rows=scanner.nextInt();
        System.out.println("Enter number of columns:");
        int cols=scanner.nextInt();
        int[][] array=new int[rows][cols];
        System.out.println("Enter array elements:");
        for(int i=0;i<array.length;i++){
            for(int j=0;j<array[0].length;j++){
                System.out.print("array["+i+"]["+j+"]:");
                array[i][j]=scanner.nextInt();
            }
        }
        System.out.println("Array elements in matrix form:");
        for(int i=0;i<array.length;i++){
            System.out.print("[ ");
            for(int j=0;j<array[0].length;j++){
                System.out.print(array[i][j]+" ");
            }
            System.out.print("]");
            System.out.println();
        }
        scanner.close();
    }
}
