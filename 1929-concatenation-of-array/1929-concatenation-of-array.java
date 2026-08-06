class Solution {
    public int[] getConcatenation(int[] nums) {
        int copy[] = new int[nums.length*2];
        for(int i = 0; i<nums.length; i++){
            copy[i] = nums[i];
            copy[nums.length + i] = nums[i];
        }
        return copy;
    }
}