import java.util.Arrays;

class Solution {
    public int[] sortedSquares(int[] nums) {
        int temp[] = new int[nums.length];
        int i = 0;
        int j = nums.length-1;
        int k = temp.length-1;
        while(k>=0){
            if(Math.abs(nums[i]) > Math.abs(nums[j])){
                temp[k] = nums[i] * nums[i];
                k--;
                i++; 
            }
            else{
                temp[k] = nums[j] * nums[j];
                k--;
                j--; 
            }
        }
        return temp;
    }
}