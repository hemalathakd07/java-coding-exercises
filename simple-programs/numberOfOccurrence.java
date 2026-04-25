// number of occurrence
// You have been given a sorted array/list of integers
// Find the total number of occurrences of 'x' in the array


import java.util.Scanner;

public class numberOfOccurrence {
    static int lowerbound(int[] arr,int key){
        int high=arr.length-1,low=0,mid;
        while(low<=high){
            mid=low+(high-low)/2;
            if(arr[mid]>=key){
                high=mid-1;
            }
            else{
                low=mid+1;
            }
        }
        return low;
    }

    static int upperbound(int[] arr,int key){
        int high=arr.length-1,low=0,mid;
        while(low<=high){
            mid=low+(high-low)/2;
            if(arr[mid]>key){
                high=mid-1;
            }
            else{
                low=mid+1;
            }
        }
        return low;
    }

    public static void main(String[] args) {
        int[] array=new int[] {1,1,1,2,2,3,3};
        System.out.print("Enter the key element:");
        Scanner scanner=new Scanner(System.in);
        int key=scanner.nextInt();
        int low=lowerbound(array,key);
        int high=upperbound(array,key);
        System.out.println("The number of times "+key+" has appeared in the given array is "+(high-low));


    }
}
