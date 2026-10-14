class Solution {
    public int shipWithinDays(int[] weights, int days) {
        int f = 0;
        int l = 0;
        for(int weight: weights){
            f = Math.max(f, weight);
            l += weight;
        }

        while(f < l){
            int mid = f + (l - f)/2;

            int dNeed = 1;
            int cWeight = 0;

            for(int weight: weights){
                if(cWeight + weight > mid){
                    dNeed++;
                    cWeight = 0;
                }

                cWeight = cWeight + weight;
            }

            if(dNeed <= days){
                l = mid;
            }
            else{
                f = mid + 1;
            }
        }

        return f;
    }
}