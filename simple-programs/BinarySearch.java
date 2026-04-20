import java.util.Scanner;

//sorted array in increasing order

public class BinarySearch {
    static int binarySearch(int[] arr, int key) {
        int n = arr.length;
        int low = 0, high = n - 1, mid,position = 0;
        while (low <= high) {
            mid = (low + high) / 2;
            if (arr[mid] == key) {
                position=mid;
                return position;

            } else {
                if (arr[mid] > key) {
                    high = mid - 1;
                } else {
                    low = mid + 1;
                }

            }
        }
        return -1;

    }

    public static void main(String[] args) {
        int[] array=new int[]{-1,12,20,45,53,83,100};

        System.out.println("Enter the key element to be searched:");
        Scanner scanner=new Scanner(System.in);
        int key=scanner.nextInt();
        int result=binarySearch(array,key);
        if(result!=-1){
            System.out.println("Key element "+key+" is found in the position "+(result+1));
        }
        else{
            System.out.println("Key element "+key+" is not found in the array");
        }
        scanner.close();

    }
}
