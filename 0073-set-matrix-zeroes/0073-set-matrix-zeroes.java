class Solution {
    public void setZeroes(int[][] arr) {
        int col = 1;
        int m = arr.length;
        int n = arr[0].length;
        for(int i = 0; i<m; i++){
            for(int j = 0; j<n; j++){
                if(arr[i][j] == 0){
                    arr[i][0] = 0;
                    if(j!=0){
                        arr[0][j] = 0;
                    }
                    else{
                        col = 0;
                    }
                }
            }
        }
        for(int i = 1; i<m; i++){
            for(int j = 1; j<n; j++){
                if(arr[i][0] == 0 || arr[0][j] == 0){
                    arr[i][j] = 0;
                }
            }
        }
        if(arr[0][0] == 0){
            for(int i = 0; i<n; i++){
                arr[0][i] = 0;
            }
        }
        if(col == 0){
            for(int i = 0; i<m; i++){
                arr[i][0] = 0;
            }
        }
    }
}