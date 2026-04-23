public class linearSearchMoveToFront {

        static int linearSearch(int[] arr,int key){
            for(int i=0;i<arr.length;i++){
                if(arr[i]==key){
                    if(i>0){
                        int temp=arr[i];
                        arr[i]=arr[0];
                        arr[0]=temp;
                    }
                    return 0;
                }
            }
            return -1;
        }

        public static void main(String[] args) {
            int[] array={23,8,56,34,1,9,8,0,2};
            int key=56;
            int result=linearSearch(array,key);
            if(result!=-1){
                System.out.println("key element "+key+" is found in the array at the position "+(result+1));
            }
            else{
                System.out.println("Key element "+key+" is not found in the array");
            }
        }
    }