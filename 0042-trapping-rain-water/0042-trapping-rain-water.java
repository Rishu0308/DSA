class Solution {
    public int trap(int[] arr) {

        int n = arr.length;

        int leftMax = arr[0];
        int rightMax = arr[n - 1];

        int[] left = new int[n];
        int[] right = new int[n];

        for (int i = 0; i < n; i++) {
            leftMax = Math.max(leftMax, arr[i]);
            left[i] = leftMax;
        }

        for (int i = n - 1; i >= 0; i--) {
            rightMax = Math.max(rightMax, arr[i]);
            right[i] = rightMax;
        }

        int ans = 0;

        for (int i = 0; i < n; i++) {
            ans += Math.min(left[i], right[i]) - arr[i];
        }

        return ans;
    }
}