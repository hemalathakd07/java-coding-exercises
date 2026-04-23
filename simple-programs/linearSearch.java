import java.util.Scanner;

public class linearSearch {
    public static void main(String[] args) {
        int[] array=new int[10];
        Scanner scanner=new Scanner(System.in);
        System.out.println("enter the array elements:");
        for(int i=0;i<array.length;i++){
            array[i]=scanner.nextInt();
        }
        int found=0;
        int key_element;
        System.out.println("enter the search element:");
        key_element=scanner.nextInt();

        for(int i=0;i<array.length;i++){
            if(key_element==array[i]){
                found=1;
                System.out.println("key element "+key_element+" is found in the position "+i+1 );
                break;
            }
        }
        if(found==0){
            System.out.println("key element "+key_element+" is not found in the given array");
        }
    }
}