public class deletionUsingNewArrayPosition {
    public static void main(String[] args) {
        int[] numbers={1,2,3,4,5};
        System.out.println("Array elements before deletion");
        for(int nums:numbers){
            System.out.print(nums+"\t");
        }
        int[] newArray=new int[numbers.length-1];
        int position=2;
        for(int i=0;i<position-1;i++){
            newArray[i]=numbers[i];
        }
        for(int i=position-1;i<newArray.length;i++){
            newArray[i]=numbers[i+1];
        }
        System.out.println("\nArray elements after deletion");
        for(int nums:newArray){
            System.out.print(nums+"\t");
        }
    }
}
