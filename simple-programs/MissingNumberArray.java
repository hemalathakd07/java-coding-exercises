//Given an array nums containing n distinct numbers in the range[0,n],
//return the only number in the range that is missing from the array
//input :
//nums=[3,0,1]
//output:
//2

public class MissingNumberArray {
    public static void main(String[] args) {
        int[] nums={3,0,1};
        int sum=0;
        int totalSum=(nums.length*(nums.length+1))/2;
        for(int i=0;i<nums.length;i++){
            sum+=nums[i];
        }
        int missingNumber=totalSum-sum;
        System.out.println("Missing number in the array is "+missingNumber);
    }
}