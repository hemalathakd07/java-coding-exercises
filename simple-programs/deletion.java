public class deletion {

    void deletionAtBeginning(int[] arr, int size) {
        for (int i = 0; i < size - 1; i++) {
            arr[i] = arr[i + 1];
        }
        arr[size - 1] = 0;
    }

    void deletionAtEnd(int[] arr, int size) {
        arr[size - 1] = 0;
    }

    void deletionAtPosition(int[] arr, int size, int position) {
        if (position < 1 || position > size) {
            System.out.println("Invalid position");
            return;
        }
        for (int i = position - 1; i < size - 1; i++) {
            arr[i] = arr[i + 1];
        }
        arr[size - 1] = 0;
    }

    void displayArrayElements(int[] array, int size) {
        for (int i = 0; i < size; i++) {
            System.out.print(array[i] + "\t");
        }
    }

    public static void main(String[] args) {
        int[] array = {0, 10, 20, 30, 40};
        int size = 5;
        System.out.println("array elements before deletion");
        for(int i=0;i<array.length;i++) {
            System.out.print(array[i] + "\t");
        }

        deletion d = new deletion();

        d.deletionAtBeginning(array, size);
        size--;
        System.out.println("\nArray elements after deleting the beginning element");
        d.displayArrayElements(array, size);

        d.deletionAtEnd(array, size);
        size--;
        System.out.println("\nArray elements after deleting the end element");
        d.displayArrayElements(array, size);

        d.deletionAtPosition(array, size, 2);
        size--;
        System.out.println("\nArray elements after deleting the given position element");
        d.displayArrayElements(array, size);
    }
}