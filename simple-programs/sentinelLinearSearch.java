
public class sentinelLinearSearch {

    static int linearSearch(int[] arr, int key, int n) {

        int last = arr[n - 1];
        arr[n - 1] = key;

        int i = 0;
        while (arr[i] != key) {
            i++;
        }

        arr[n - 1] = last;

        if (i < n - 1 || arr[n - 1] == key) {
            return i; // found → return index
        } else {
            return -1; // not found
        }
    }

    public static void main(String[] args) {

        int[] array = {5, 110, 6, 20, 3, 4};
        int key = 110;

        int result = linearSearch(array, key, array.length);

        if (result != -1) {
            System.out.println("Key element " + key + " found at position " + (result + 1));
        } else {
            System.out.println("Key element not found");
        }
    }
}