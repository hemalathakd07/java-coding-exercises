import java.util.Scanner;

// search for a specific element in the array (linear search)
public class SearchElement {
    public static void main(String[] args) {

        int[] array=new int[]{2,43,3,10,0};
        System.out.println("enter the key element to be searched:");
        Scanner scanner=new Scanner(System.in);
        int key_element=scanner.nextInt();
        int found=0;
        for(int i=0;i<array.length;i++){
            if(key_element==array[i]){
                found=1;
                System.out.println("Key element "+key_element+" is found in the index "+i);
                break;
            }
        }

        if(found==0){
            System.out.println("Key element "+key_element+" is not found ");
        }
        scanner.close();

    }
}
