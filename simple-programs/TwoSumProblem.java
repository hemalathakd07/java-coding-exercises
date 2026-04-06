// Given an array of integers , return the indices of two numbers that add up to a target
//input : nums=[2,7,11,15] , target=9
//output :[0,1]

import java.util.Arrays;

public class TwoSumProblem {
    static int[] findIndices(int[] nums,int target){
        int[] resultArray=new int[2];
        for(int i=0;i<nums.length;i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    resultArray=new int[] {i,j};
                    return resultArray;
                }
            }
        }
        return null;
    }
    public static void main(String[] args) {
        int[] nums={2,7,11,15};
        int target=9;
        int[] result=findIndices(nums,target);
        System.out.println(Arrays.toString(result));

        }
    }
