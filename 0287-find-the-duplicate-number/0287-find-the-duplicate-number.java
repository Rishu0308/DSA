class Solution {
    public void swap(int[] nums, int i, int j){
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
    public int findDuplicate(int[] nums) {
        int i = 0;
        while(i<nums.length){
            if(nums[i] != i+1){
                int ind = nums[i] - 1;
                if(nums[i] != nums[ind]){
                    swap(nums, i, ind);
                } 
                else{
                    return nums[i];
                }
            }
            else{
                i++;
            }
        }
        return -1;
    }
}