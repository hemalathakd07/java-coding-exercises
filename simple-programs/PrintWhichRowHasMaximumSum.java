public class PrintWhichRowHasMaximumSum {
    static void maximumSum(int[][] array) {
        int maxSum = Integer.MIN_VALUE;
        int maxSumRowIndex = -1;
        for (int i = 0; i < array.length; i++) {
            int sum = 0;
            for (int j = 0; j < array[i].length; j++) {
                sum += array[i][j];
            }
            if (sum > maxSum) {
                maxSum = sum;
                maxSumRowIndex = i;
            }
        }
        System.out.println("Row "+(maxSumRowIndex+1)+" has maximum sum");
    }
    public static void main(String[] args) {
        int[][] array = new int[][]{{1, 2}, {3, 5, 6}, {6, 7, 8, 9}};
        maximumSum(array);
    }
}