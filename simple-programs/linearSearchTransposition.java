import java.util.Arrays;

public class linearSearchTransposition {

        static int linearSearch(int[] arr,int key){
            for(int i=0;i<arr.length;i++){
                if(arr[i]==key){
                    if(i>0){
                        int temp=arr[i];
                        arr[i]=arr[i-1];
                        arr[i-1]=temp;
                        return i-1;
                    }
                    return i;
                }
            }
            return -1;
        }
        public static void main(String[] args) {
            int[] array={23,8,56,34,1,9,8,0,2};
            int key=8;
            int result=linearSearch(array,key);
            System.out.println(Arrays.toString(array));
            if(result!=-1){
                System.out.println("key element "+key+" is found in the array at the position "+(result+1));
            }
            else{
                System.out.println("Key element "+key+" is not found in the array");
            }
        }
    }