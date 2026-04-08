//Given an array nums containing n distinct numbers in the range[0,n],
//return the only number in the range that is missing from the array
//input :
//nums=[3,0,1]
//output:
//2

public class MissingNumberInArray {
    public static void main(String[] args) {
        int[] nums={3,0,1};
        int n=nums.length;
        int xor=0;
        for(int i=0;i<n;i++){
            xor^=nums[i];
        }
        for(int i=0;i<=n;i++){
            xor^=i;
        }
        System.out.println("Missing number in the array is "+xor);
    }
}