public class insertionUsingNewArrayAtEnd {
    public static void main(String[] args) {
        int[] numbers={1,2,3,4,5};
        System.out.println("Array elements before inserting an element at the end");
        for(int nums:numbers){
            System.out.print(nums+"\t");
        }
        int newElement=6;
        int[] newArray=new int[numbers.length+1];
        for(int i=0;i<numbers.length;i++){
            newArray[i]=numbers[i];
        }
        newArray[newArray.length-1]=newElement;
        System.out.println("\nArray elements after inserting an element at the end ");
        for(int nums:newArray){
            System.out.print(nums+"\t");
        }

    }
}
