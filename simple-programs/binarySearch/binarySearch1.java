//find first and last position of the sorted array

// given array of integers , sorted in ascending order
//find the starting and ending position of the given target value
// if target is not found return -1 ,-1

import java.util.Arrays;

public class binarySearch1 {
    static int[] firstAndLastPosition(int[] arr,int target){
        int[] result={-1,-1};
        for(int i=0;i<arr.length;i++){
            if(arr[i]==target){
                    if(result[0]==-1){
                        result[0]=i;
                    }
                    result[1]=i;
            }
        }
        return result;

    }
    public static void main(String[] args) {
        int[] array=new int[]{5,7,7,8,8,10};
        int target=8;
        int[] result=firstAndLastPosition(array,target);
        System.out.println(Arrays.toString(result));
    }

}
