import java.util.Scanner;

public class InsertAnElementAtEnd {
  void insertionEnd(int[] arr,int element,int size){
    if(size >= arr.length){
    System.out.println("Array is full, cannot insert");
    return;
}
    arr[size]=element;
  }
  public static void main(String[] args) {
    int[] array=new int[100];
    System.out.println("Enter elements of array");
    Scanner scanner=new Scanner(System.in);
    int size=5;
    for(int i=0;i<size;i++){
      array[i]=scanner.nextInt();
    }

    System.out.println("Array elements before insertion is ");
    for(int i=0;i<size;i++){
      System.out.print(array[i]+"\t");
    }

    int element=100;
    InsertAnElementAtEnd insertion=new InsertAnElementAtEnd();
    insertion.insertionEnd(array,element,size);
    size++;
    System.out.println("\nArray elements after inserting at the end is ");
    for(int i=0;i<size;i++){
      System.out.print(array[i]+"\t");
    }
    scanner.close();

  }
}
