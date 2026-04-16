public class JaggedArrayTranspose {
    public static void main(String[] args) {
        int[][] arr = {
                {1, 2, 3},
                {4, 5},
                {6}
        };

        int maxCols = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].length > maxCols) {
                maxCols = arr[i].length;
            }
        }

        System.out.println("Transpose:");
        for (int i = 0; i < maxCols; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (i < arr[j].length) {
                    System.out.print(arr[j][i] + "\t");
                } else {
                    System.out.print(" \t");
                }
            }
            System.out.println();
        }
    }
}