class Solution {
    public void swap(int arr[], int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public int missingNumber(int[] arr) {
        int i = 0;
        int n = arr.length;
        while (i < n) {
            int ind = arr[i];

            if (arr[i] >= 0 && arr[i] < n && arr[i] != arr[ind]) {
                swap(arr, i, ind);
            }
            else{
                i++;
            }
        }

        for(int j = 0; j<arr.length; j++){
            if(arr[j] != j){
                return j;
            }
        }
        return n;
    }
}