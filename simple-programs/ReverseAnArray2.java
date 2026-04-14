// write a program to reverse an array ..
// your task is to write a method that reverse the elements of the array in place ,
// such that the first element becomes the last , the second element becomes the second last and so on

import java.util.Arrays;

public class ReverseAnArray2 {
    static int[] reverseArrayOrder(int[] array){
        int rightIndex=array.length-1;
        int leftIndex=0;
        while(leftIndex<rightIndex){
                int temp=array[rightIndex];
                array[rightIndex]=array[leftIndex];
                array[leftIndex]=temp;
                rightIndex--;
                leftIndex++;
        }
        System.out.println(Arrays.toString(array));
        return array;
    }
    public static void main(String[] args) {
        int[] array={1,2,3,10,4,5,6};
        System.out.println(Arrays.toString(reverseArrayOrder(array)));
    }
}