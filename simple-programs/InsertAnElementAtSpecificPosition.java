import java.util.Scanner;

public class InsertAnElementAtSpecificPosition {
  void insertionAtPosition(int[] arr, int element, int size, int position){

    if(size >= arr.length){
        System.out.println("Array is full");
        return;
    }

    if(position < 1 || position > size + 1){
        System.out.println("Invalid position");
        return;
    }

    for(int i=size;i>=position;i--){
        arr[i]=arr[i-1];
    }
    arr[position-1]=element;
}
  public static void main(String[] args) {
    int[] array=new int[20];
    int size=5;
    System.out.println("Enter array elements:");
    Scanner scanner=new Scanner(System.in);
    for(int i=0;i<size;i++){
      array[i]=scanner.nextInt();
    }

    int element=12;
    int position=2;

    System.out.println("Array elements before insertion :");
    for(int i=0;i<size;i++){
      System.out.print(array[i]+"\t");
    }

    InsertAnElementAtSpecificPosition insertion=new InsertAnElementAtSpecificPosition();
    insertion.insertionAtPosition(array,element,size,position);
    size++;
    System.out.println("\nArray after insertion :");
    for(int i=0;i<size;i++){
      System.out.print(array[i]+"\t");
    }
    
    scanner.close();
  }
  
}
