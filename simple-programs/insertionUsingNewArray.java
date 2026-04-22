public class insertionUsingNewArray {
    public static void main(String[] args) {
        int[] numbers=new int[]{1,2,3,4,5};
        int newElement=0;
        System.out.println("Array before inserting new element");
        for(int nums:numbers){
            System.out.print(nums+"\t");
        }

        int[] newArray=new int[numbers.length+1];
        newArray[0]=newElement;

        for(int i=0;i<numbers.length;i++){
            newArray[i+1]=numbers[i];
        }

        System.out.println("\nArray after inserting new element:");
        for(int nums:newArray){
            System.out.print(nums+"\t");
        }
    }
}
