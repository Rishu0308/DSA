class Solution {
    public static int[] mergeSort(int[] nums1, int m, int[] nums2, int n){

        int i = m - 1;// last actual element of nums1
        int j = n - 1;//last element of nums2
        int k = m + n - 1;//last position of nums1

        while(i>=0 && j>=0){
            if(nums1[i]>=nums2[j]){
                nums1[k--]=nums1[i--];
            }else{
                nums1[k--]=nums2[j--];
            }
        }
        //remaining elements
        while (i >= 0) {
            nums1[k--] = nums1[i--];
        }
        while (j >= 0) {
            nums1[k--] = nums2[j--];
        }

        return nums1;
    }

    public void merge(int[] nums1, int m, int[] nums2, int n) {
        mergeSort(nums1,m,nums2,n);
    }
}