public class MajorityElement {
    static int majorityElement(int[] nums){
        int max=0;
        int number=nums[0];

        for(int i=0;i<nums.length;i++){
            int num=nums[i];
            int count=0;
            for(int j=0;j<nums.length;j++){
                if(nums[j]==num){
                    count++;
                }
            }
            if(count>(nums.length/2)){
                return nums[i];
            }

        }
        return number;
    }

    public static void main(String[] args) {
        int[] nums={2,2,1,1,1,2,2};
        int result=majorityElement(nums);
        System.out.println(result);
    }
}
