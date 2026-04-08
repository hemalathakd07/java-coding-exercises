import java.util.Scanner;


public class MultiplicationOfTwoDArray {
    public static void main(String[] args) {
        System.out.println("Enter the number of rows of first matrix:");
        Scanner scanner=new Scanner(System.in);
        int r1=scanner.nextInt();
        System.out.println("Enter the number of columns of first matrix:");
        int c1=scanner.nextInt();
        int[][] array1=new int[r1][c1];
        System.out.println("Enter the number of rows of second matrix:");
        int r2=scanner.nextInt();
        System.out.println("Enter the number of columns of second matrix:");
        int c2=scanner.nextInt();
        int[][] array2=new int[r2][c2];

        if(c1!=r2){
            System.out.println("Matrix multiplication cannot be performed!");
            return;
        }
        System.out.println("Enter array1 elements:");
        for(int i=0;i<array1.length;i++){
            for(int j=0;j<array1[i].length;j++){
                System.out.print("array1["+i+"]["+j+"]:");
                array1[i][j]=scanner.nextInt();
            }
        }
        System.out.println("Enter array2 elements:");
        for(int i=0;i<array2.length;i++){
            for(int j=0;j<array2[i].length;j++){
                System.out.print("array2["+i+"]["+j+"]:");
                array2[i][j]=scanner.nextInt();
            }
        }
        System.out.println("Array1 elements are :");
        for(int i=0;i<array1.length;i++){
            for(int j=0;j<array1[i].length;j++){
                System.out.print(array1[i][j]+"\t");
            }
            System.out.println();
        }
        System.out.println("Array2 elements are :");
        for(int i=0;i<array2.length;i++){
            for(int j=0;j<array2[i].length;j++){
                System.out.print(array2[i][j]+"\t");
            }
            System.out.println();
        }

            int[][] multipliedMatrix=new int[r1][c2];
            for(int i=0;i<r1;i++){
                for(int  j=0;j<c2;j++){
                    for(int k=0;k<c1;k++){
                        multipliedMatrix[i][j]+=array1[i][k]*array2[k][j];
                    }
                }
            }
            System.out.println("Multiplication of two Matrix is ");
            for(int i=0;i<multipliedMatrix.length;i++){
                for(int j=0;j<multipliedMatrix[i].length;j++){
                    System.out.print(multipliedMatrix[i][j]+"\t");
                }
                System.out.println();
            }
        }
    }