public class FloorAndCeil {
    static void floorCeil(int[] arr,int key){
        int floor=-1,ceil=-1;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==key){
                floor=arr[i];
                ceil=arr[i];
                break;
            }
            else if(arr[i]<key){
                floor=arr[i];
            }
            else{
                ceil=arr[i];
                break;
            }
        }
        System.out.println("Floor:"+floor+"\nCeil:"+ceil);
    }
    public static void main(String[] args) {
        int[] array=new int[] {2,3,5,7,8,10,15,18,20,25};
        floorCeil(array,6);

    }
}
