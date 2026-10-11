class Solution {
    public void swap(int[] arr, int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public List<Integer> findDisappearedNumbers(int[] arr) {
        int i = 0;
        while(i<arr.length){
            int ind = arr[i] - 1;
            if(arr[i] != arr[ind]){
                swap(arr, i, ind);
            }
            else{
                i++;
            }
        }

        List<Integer> list = new ArrayList<>();

        for(int j = 0; j<arr.length; j++){
            if(j+1 != arr[j]){
                list.add(j+1);
            }
        }
        return list;
    }
}