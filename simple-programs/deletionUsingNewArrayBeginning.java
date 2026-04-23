public class deletionUsingNewArrayBeginning {
    public static void main(String[] args) {
        int[] numbers={0,1,2,3,4,5};
        System.out.println("array elements before deletion");
        for(int nums:numbers){
            System.out.print(nums+"\t");
        }
        int[] newArray=new int[numbers.length-1];
        for(int i=0;i<newArray.length;i++){
            newArray[i]=numbers[i+1];
        }

        System.out.println("\nArray elements after deletion");
        for(int nums:newArray){
            System.out.print(nums+"\t");
        }


    }
}
