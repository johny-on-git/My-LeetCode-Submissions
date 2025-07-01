class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {

                int column = matrix[0].length -1;
        int row=-1;

        for(int i=0;i<matrix.length;i++)
        {
            if(target == matrix[i][0] ||  target == matrix[i][column]){
                return true;
            }
            else if(target > matrix[i][0] &&  target <matrix[i][column])
            {
                row = i;
                break;
            }
            
        }
        if(row ==-1)
        {
            return false;
        }
        
        int[] row1 = matrix[row];
        int start = 0;
        int end = row1.length-1;

        while (start <= end )
        {
            int mid = start + ( end - start)/2;
            if(target == row1[mid])
            {
                return true;
            }
            else if (target < row1[mid])
            {
                end = mid-1;
            }
            else
            {
                start = mid+1;
            }
        }
        

        return false;
        
    }
}