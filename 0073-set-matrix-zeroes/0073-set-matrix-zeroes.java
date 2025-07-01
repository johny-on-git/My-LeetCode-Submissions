class Solution {
    public void setZeroes(int[][] matrix) {

        Boolean zeroRowFlag=false;
        Boolean zeroColFlag=false;

        for(int i=0;i<matrix[0].length;i++)
        {
            if(matrix[0][i] == 0)
            {
                zeroRowFlag = true;
                break;
                }
        }

        for(int j=0;j<matrix.length;j++)
        {
            if(matrix[j][0] == 0)
            {
                zeroColFlag = true;
                break;
                }
        }

        for(int m =1;m<matrix.length;m++)
        {
            for(int n=1; n<matrix[0].length;n++)
            {
                if(matrix[m][n] == 0)
                {
                    matrix[0][n] =0;
                    matrix[m][0] = 0;
                }
            }
        }



        for(int m =1;m<matrix.length;m++)
        {
            for(int n=1; n<matrix[0].length;n++)
            {
                if(matrix[0][n] == 0 || matrix[m][0] ==0)
                {
                    matrix[m][n] =0;
                }
            }
        }

        if(zeroRowFlag)
        {
            for(int s=0;s<matrix[0].length;s++)
            {
                matrix[0][s] = 0;
            }
        }


        if(zeroColFlag)
        {
            for(int s=0;s<matrix.length;s++)
            {
                matrix[s][0] = 0;
            }
        }

}
}