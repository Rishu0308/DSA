class Solution {
    public int maxArea(int[] arr) {

        int maxArea = 0;
        int i = 0;
        int j = arr.length - 1;

        while (i < j) {

            int area = Math.min(arr[i], arr[j]) * (j - i);

            maxArea = Math.max(maxArea, area);

            if (arr[i] < arr[j]) {
                i++;
            } else {
                j--;
            }
        }

        return maxArea;
    }
}