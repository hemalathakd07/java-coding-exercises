public class TransposeOfTwoDArray {
    public static void main(String[] args) {
        int[][] array=new int[][]{{2,4,6,8},{1,2,3,4}};
        System.out.println("Matrix before transpose is ");
        for(int i=0;i<array.length;i++){
            for(int j=0;j<array[i].length;j++){
                System.out.print(array[i][j]+"\t");
            }
            System.out.println();
        }

        System.out.println("Transpose matrix is ");
        for(int i=0;i<array[0].length;i++){
            for(int j=0;j<array.length;j++){
                System.out.print(array[j][i]+"\t");
            }
            System.out.println();
        }
    }
}
