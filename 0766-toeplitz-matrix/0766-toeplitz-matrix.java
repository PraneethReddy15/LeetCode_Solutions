class Solution {
    public boolean isToeplitzMatrix(int[][] matrix) {
        for(int i=1;i<matrix.length;i++)
        {
            for(int j=1;j<matrix[i].length;j++)
            {
                if(matrix[i-1][j-1]!=matrix[i][j]) return false;
            }
        }
        for(int i=matrix.length-2;i>=0;i--)
        {
            for(int j=matrix[i].length-2;j>=0;j--)
            {
                if(matrix[i+1][j+1]!=matrix[i][j]) return false;
            }
        }
        return true;
    }
}