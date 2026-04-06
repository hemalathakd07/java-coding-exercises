// write a program that takes a 2D array of integers as input and prints the summ of all the elements in the array

import java.util.Scanner;

public class SumOfTwoArrayElements {
    public static void main(String[] args) {
        System.out.println("Enter the number of rows:");
        Scanner scanner=new Scanner(System.in);
        int m=scanner.nextInt();
        System.out.println("Enter number of columns:");
        int n=scanner.nextInt();
        int[][] array=new int[m][n];
        System.out.println("Enter array elements:");
        for(int i=0;i<array.length;i++){
            for(int j=0;j<array[0].length;j++){
                array[i][j]=scanner.nextInt();
            }
        }
        int sum=0;
        for(int i=0;i<array.length;i++){
            for(int j=0;j<array[i].length;j++){
                sum+=array[i][j];
            }
        }
        System.out.println("Sum of the array elements is "+sum);
    }
}