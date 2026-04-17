public class ContainerWithMostWater {
    static void findLargestWaterArea(int[] height){
        int maxWater=0;
        for(int i=0;i<height.length;i++){
            for(int j=i+1;j<height.length;j++){
                int h=Math.min(height[i],height[j]);
                int w=j-i;
                int currentWater=h*w;
                if(currentWater>maxWater){
                    maxWater=currentWater;
                }
            }
        }
        System.out.println("The maximum area of water can be stored in the container is "+maxWater);

    }
    public static void main(String[] args) {
        int[] height={1,8,6,2,5,4,8,3,7};
        findLargestWaterArea(height);
        }
}
