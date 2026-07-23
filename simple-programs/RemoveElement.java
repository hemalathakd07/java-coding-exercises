public class RemoveElement {
    public static void main(String[] args) {
        int[] nums={3,2,3,2};
        int val=3;

        int j=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]!=val){
                nums[j]=nums[i];
                j++;
            }
        }
        System.out.println(j);
    }
}