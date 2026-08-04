class Solution {
    public int diagonalSum(int[][] mat) {
        int sum = 0;
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat.length; j++) {
                if (i==j || (i == 0 && j == mat.length-1 ) || (j == 0 && i==mat.length-1) || (i + j == mat.length-1)) {
                    sum = sum + mat[i][j];
                    System.out.println(mat[i][j]);
                }
            }
        }
        return sum;
    }
}