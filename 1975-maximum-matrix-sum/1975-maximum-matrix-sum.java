class Solution {
    public long maxMatrixSum(int[][] matrix) 
    {
        long totalSum = 0;
        int minAbsValue = Integer.MAX_VALUE;
        int negativeCount = 0;
        for(int i = 0;i<matrix.length;i++) 
        {
            for(int j=0;j<matrix[0].length;j++) 
            {
                int value = matrix[i][j];
                totalSum += Math.abs(value);
                if(value < 0) 
                {
                    negativeCount++;
                }
                minAbsValue = Math.min(minAbsValue, Math.abs(value));
            }
        }
        if(negativeCount % 2 != 0) 
        {
            totalSum -= 2 * minAbsValue;
        }
        return totalSum;
    }
}
