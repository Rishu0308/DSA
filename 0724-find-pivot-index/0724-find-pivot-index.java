class Solution {
    public int pivotIndex(int[] nums) {
        int sum = 0;
        for(int i = 0; i<nums.length;i++){
            sum = sum + nums[i];
        }
        int y = 0;
        for(int i = 0; i<nums.length; i++){
            if(y==sum-y-nums[i]){
                return i;
            }
            y = y + nums[i];
        }
        return -1;
    }
}