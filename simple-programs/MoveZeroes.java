import java.util.Arrays;

//Given an integer array nums , move all 0's to the end of it ,
// while maintaining the relative order of the non-zero elements
//input nums=[0,1,0,3,12]
//output=[1,3,12,0,0]
public class MoveZeroes {
    public static void main(String[] args) {
        int[] nums={0,1,0,3,12};
        int j=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]!=0){
                nums[j]=nums[i];
                j++;
            }
        }
        while(j<nums.length){
            nums[j]=0;
            j++;
        }
        System.out.println(Arrays.toString(nums));
    }
}