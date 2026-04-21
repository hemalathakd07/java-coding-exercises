import java.util.Scanner;
public class InsertAnElementAtBeginning{
  void insertion(int[] arr,int element,int size){
    if(size >= arr.length){
    System.out.println("Array is full, cannot insert");
    return;
}
    for(int i=size;i>0;i--){
      arr[i]=arr[i-1];
    }
    arr[0]=element;
  }
  public static void main(String[] args) {
    int[] array=new int[100];
    int size=5;
    int element=195;
    System.out.println("Enter array elements:");
    Scanner scanner=new Scanner(System.in);
    for(int i=0;i<size;i++){
      array[i]=scanner.nextInt();
    }
    System.out.println("Array before insertion:");
    for(int i=0;i<size;i++){
      System.out.print(array[i]+"\t");
    }

    System.out.println();
    InsertAnElementAtBeginning insertion=new InsertAnElementAtBeginning();
    insertion.insertion(array,element,size);
    size++;

    System.out.println("Array after insertion:");
    for(int i=0;i<size;i++){
      System.out.print(array[i]+"\t");
    }
    scanner.close();

  }

}