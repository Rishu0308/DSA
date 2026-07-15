class Solution {
    public int mostFrequentEven(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i=0; i<nums.length; i++){
            if(nums[i] % 2 == 0){
                map.put(nums[i], map.getOrDefault(nums[i], 0)+1);
            }
        }
        int freq = 0;
        int ans = -1;
        for(int ele: map.keySet()){
            if(map.get(ele) > freq ){
                freq = map.get(ele);
                ans = ele;
            }
            else if(map.get(ele) == freq){
                ans = Math.min(ans, ele);
            }
        }
        return ans;
    }
}