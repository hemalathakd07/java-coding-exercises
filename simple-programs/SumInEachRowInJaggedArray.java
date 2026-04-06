public class SumInEachRowInJaggedArray {
    static void rowSum(int[][] array){
        for(int i=0;i<array.length;i++){
            int sum=0;
            for(int j=0;j<array[i].length;j++){
                sum+=array[i][j];
            }
            System.out.println("row "+(i+1)+" sum :"+sum);
        }
    }
    public static void main(String[] args) {
        int[][] array=new int[][]{{1,2,3},{4,5},{10,7,5,-1}};
        rowSum(array);
    }
}
