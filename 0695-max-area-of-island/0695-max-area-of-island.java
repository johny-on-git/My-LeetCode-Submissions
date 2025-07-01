class Solution {
    public int maxAreaOfIsland(int[][] grid) {

        boolean[][] flag = new boolean[grid.length][grid[0].length];
        int area = 0;

        for(int i=0;i<grid.length;i++)
        {
            for(int j=0; j<grid[0].length;j++)
            {
                if(flag[i][j] == false)
                {
                int areaNow = findArea(grid,flag,i,j);
                area = Math.max(areaNow,area);
                }
            }
        }
        return area;
    }

    public int findArea(int[][] grid,boolean[][] flag,int i,int j)
        {   
            int thisCell=0;
            if(i>=0 && i<grid.length
              && j>=0 && j< grid[0].length
              && flag[i][j] ==false
              && grid[i][j] == 1)
              {
                flag[i][j] =true;
                thisCell= 1;
              }

              else{
                return 0;
              }

            int a1 = findArea(grid,flag,i+1,j);
            int a2 = findArea(grid,flag,i-1,j);
            int b1 = findArea(grid,flag,i,j+1);
            int b2 = findArea(grid,flag,i,j-1);

            return thisCell+a1+a2+b1+b2;

        }
}
