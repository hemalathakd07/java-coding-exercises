public class deletionUsingNewArrayEnd {
    public static void main(String[] args) {
        int[] numbers={1,2,3,4,5};
        int[] newArray=new int[numbers.length-1];

        System.out.println("Array elements before deletion");
        for(int nums:numbers){
            System.out.print(nums+"\t");
        }

        for(int i=0;i<newArray.length;i++){
            newArray[i]=numbers[i];
        }
        System.out.println("\nArray elements after deletion");
        for(int nums:newArray){
            System.out.print(nums+"\t");
        }


    }
}
