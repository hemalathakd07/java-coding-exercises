public class ContainerWithMostWater_extension {
    public static void main(String[] args) {
        int[] height={1,8,6,2,5,4,8,3,7};
        int maxWater=0;
        int rightPointer=height.length-1;
        int leftPointer=0;
        while(leftPointer<rightPointer){
            int w=rightPointer-leftPointer;
            int h=Math.min(height[leftPointer],height[rightPointer]);
            int currentWater=w*h;
            if(currentWater>maxWater){
                maxWater=currentWater;
            }
            if(height[leftPointer]<height[rightPointer]){
                leftPointer++;
            }
            else{
                rightPointer--;
            }
        }
        System.out.println("Maximum area of water can be stored in the container is "+maxWater);
    }
}