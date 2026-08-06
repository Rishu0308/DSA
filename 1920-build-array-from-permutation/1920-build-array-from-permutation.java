class Solution {
    public int[] buildArray(int[] nums) {
        int copy []= new int[nums.length]; 
        for (int i = 0; i < nums.length; i++) {
            copy[i] = nums[nums[i]];
        }
        return copy;
    }
}