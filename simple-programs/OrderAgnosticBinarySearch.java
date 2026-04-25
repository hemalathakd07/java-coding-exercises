import java.util.Scanner;

public class OrderAgnosticBinarySearch {

    static int orderAgnosticBinarySearch(int[] arr, int key) {
        int low = 0;
        int high = arr.length - 1;

        // Check sorting order
        boolean isAscending = arr[low] < arr[high];

        while (low <= high) {
            int mid = low-(high-low) / 2;

            if (arr[mid] == key) {
                return mid;
            }

            if (isAscending) {
                // Ascending order
                if (key < arr[mid]) {
                    high = mid - 1;
                } else {
                    low = mid + 1;
                }
            } else {
                // Descending order
                if (key < arr[mid]) {
                    low = mid + 1;
                } else {
                    high = mid - 1;
                }
            }
        }
        return -1;
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter number of elements:");
        int n = scanner.nextInt();

        int[] array = new int[n];
        System.out.println("Enter array elements (sorted either asc or desc):");
        for (int i = 0; i < n; i++) {
            array[i] = scanner.nextInt();
        }

        System.out.println("Enter key to search:");
        int key = scanner.nextInt();

        int result = orderAgnosticBinarySearch(array, key);

        if (result != -1) {
            System.out.println("Key " + key + " found at position " + (result + 1));
        } else {
            System.out.println("Key " + key + " not found");
        }
    }
}