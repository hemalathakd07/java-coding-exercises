public class insertionUsingNewArrayAtSpecificPosition {
    public static void main(String[] args) {
        int[] numbers=new int[]{1,2,3,4,5};
        int[] newArray=new int[numbers.length+1];
        int newElement=10;
        int position=3;
        System.out.println("Array elements before inserting is");
        for(int nums:numbers){
            System.out.print(nums+"\t");
        }
        for(int i=0;i<position-1;i++){
            newArray[i]=numbers[i];
        }
        newArray[position-1]=newElement;
        for(int i=position-1;i<numbers.length;i++){
            newArray[i+1]=numbers[i];
        }

        System.out.println("\nArray elements after inserting an element "+newElement+" at the position "+position+" is");
        for(int nums:newArray){
            System.out.print(nums+"\t");
        }
    }
}
